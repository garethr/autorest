/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

var models = require('./index');

/**
 * @class
 * Initializes a new instance of the Product class.
 * @constructor
 * @member {object} [properties]
 * 
 * @member {number} [properties.id]
 * 
 * @member {string} [properties.name]
 * 
 */
function Product(parameters) {
  if (parameters !== null && parameters !== undefined) {
    if (parameters.properties) {
      this.properties = new models['ProductProperties'](parameters.properties);
    }
  }    
}


/**
 * Validate the payload against the Product schema
 *
 * @param {JSON} payload
 *
 */
Product.prototype.serialize = function () {
  var payload = {};
  if (this['properties']) {
    payload['properties'] = this['properties'].serialize();
  }

  return payload;
};

/**
 * Deserialize the instance to Product schema
 *
 * @param {JSON} instance
 *
 */
Product.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance['properties']) {
      this['properties'] = new models['ProductProperties']().deserialize(instance['properties']);
    }
  }

  return this;
};

module.exports = Product;
