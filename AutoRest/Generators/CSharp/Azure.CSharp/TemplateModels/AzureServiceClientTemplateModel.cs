﻿// Copyright (c) Microsoft Open Technologies, Inc. All rights reserved.
// Licensed under the Apache License, Version 2.0. See License.txt in the project root for license information.

using System;
using System.Collections.Generic;
using System.Linq;
using Microsoft.Rest.Generator.Azure;
using Microsoft.Rest.Generator.ClientModel;
using Microsoft.Rest.Generator.Utilities;

namespace Microsoft.Rest.Generator.CSharp.Azure
{
    public class AzureServiceClientTemplateModel : ServiceClientTemplateModel
    {
        public AzureServiceClientTemplateModel(ServiceClient serviceClient)
            : base(serviceClient)
        {
            // TODO: Initialized in the base constructor. Why Clear it?
            MethodTemplateModels.Clear();
            Methods.Where(m => m.Group == null)
                .ForEach(m => MethodTemplateModels.Add(new AzureMethodTemplateModel(m, serviceClient)));
        }

        /// <summary>
        /// Returns the OperationsTemplateModels for the ServiceClient.
        /// </summary>
        public override IEnumerable<MethodGroupTemplateModel> Operations
        {
            get
            {
                return MethodGroups.Select(mg => new AzureMethodGroupTemplateModel(this, mg));
            }
        }

        /// <summary>
        /// Returns the using statements for the ServiceClient.
        /// </summary>
        public override IEnumerable<string> Usings
        {
            get
            {
                if (Methods.Any(m =>
                    m.Parameters.Any(p =>
                        p.SerializedName.Equals("$filter", StringComparison.OrdinalIgnoreCase) &&
                        p.Type is CompositeType &&
                        p.Location == ParameterLocation.Query)))
                {
                    yield return "System.Linq.Expressions";
                    yield return "Microsoft.Rest.Azure.OData";
                }
                yield return "Microsoft.Rest.Azure";

                if (this.ModelTypes.Any( m => !m.Extensions.ContainsKey(AzureCodeGenerator.ExternalExtension)))
                {
                    yield return "Models";
                }
            }
        }
    }
}