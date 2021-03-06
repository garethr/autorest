// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsValidation
{
    using System;
    using System.Collections;
    using System.Collections.Generic;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Models;

    public static partial class AutoRestValidationTestExtensions
    {
            /// <summary>
            /// Validates input parameters on the method. See swagger for details.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceGroupName'>
            /// Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
            /// </param>
            /// <param name='id'>
            /// Required int multiple of 10 from 100 to 1000.
            /// </param>
            public static Product ValidationOfMethodParameters(this IAutoRestValidationTest operations, string resourceGroupName, int? id)
            {
                return Task.Factory.StartNew(s => ((IAutoRestValidationTest)s).ValidationOfMethodParametersAsync(resourceGroupName, id), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Validates input parameters on the method. See swagger for details.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceGroupName'>
            /// Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
            /// </param>
            /// <param name='id'>
            /// Required int multiple of 10 from 100 to 1000.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<Product> ValidationOfMethodParametersAsync( this IAutoRestValidationTest operations, string resourceGroupName, int? id, CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Product> result = await operations.ValidationOfMethodParametersWithHttpMessagesAsync(resourceGroupName, id, null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

            /// <summary>
            /// Validates body parameters on the method. See swagger for details.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceGroupName'>
            /// Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
            /// </param>
            /// <param name='id'>
            /// Required int multiple of 10 from 100 to 1000.
            /// </param>
            /// <param name='body'>
            /// </param>
            public static Product ValidationOfBody(this IAutoRestValidationTest operations, string resourceGroupName, int? id, Product body = default(Product))
            {
                return Task.Factory.StartNew(s => ((IAutoRestValidationTest)s).ValidationOfBodyAsync(resourceGroupName, id, body), operations, CancellationToken.None, TaskCreationOptions.None, TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Validates body parameters on the method. See swagger for details.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='resourceGroupName'>
            /// Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
            /// </param>
            /// <param name='id'>
            /// Required int multiple of 10 from 100 to 1000.
            /// </param>
            /// <param name='body'>
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async Task<Product> ValidationOfBodyAsync( this IAutoRestValidationTest operations, string resourceGroupName, int? id, Product body = default(Product), CancellationToken cancellationToken = default(CancellationToken))
            {
                HttpOperationResponse<Product> result = await operations.ValidationOfBodyWithHttpMessagesAsync(resourceGroupName, id, body, null, cancellationToken).ConfigureAwait(false);
                return result.Body;
            }

    }
}
