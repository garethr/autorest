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

var util = require('util');
var msRest = require('ms-rest');
var msRestAzure = require('ms-rest-azure');
var ServiceClient = msRest.ServiceClient;
var WebResource = msRest.WebResource;

var models = require('../models');

/**
 * @class
 * ParameterGrouping
 * __NOTE__: An instance of this class is automatically created for an
 * instance of the AutoRestParameterGroupingTestService.
 * Initializes a new instance of the ParameterGrouping class.
 * @constructor
 *
 * @param {AutoRestParameterGroupingTestService} client Reference to the service client.
 */
function ParameterGrouping(client) {
  this.client = client;
}

/**
 * Post a bunch of required parameters grouped
 *
 * @param {object} parameterGroupingPostRequiredParameters Additional
 * parameters for the operation
 * 
 * @param {number} [parameterGroupingPostRequiredParameters.body]
 * 
 * @param {string} [parameterGroupingPostRequiredParameters.customHeader]
 * 
 * @param {number} [parameterGroupingPostRequiredParameters.query] Query
 * parameter with default
 * 
 * @param {string} [parameterGroupingPostRequiredParameters.path] Path
 * parameter
 * 
 * @param {object} [options]
 *
 * @param {object} [options.customHeaders] headers that will be added to
 * request
 *
 * @param {function} callback
 *
 * @returns {function} callback(err, result, request, response)
 *
 *                      {Error}  err        - The Error object if an error occurred, null otherwise.
 *
 *                      {null} [result]   - The deserialized result object.
 *
 *                      {object} [request]  - The HTTP Request object if an error did not occur.
 *
 *                      {stream} [response] - The HTTP Response stream if an error did not occur.
 */
ParameterGrouping.prototype.postRequired = function (parameterGroupingPostRequiredParameters, options, callback) {
  var client = this.client;
  if(!callback && typeof options === 'function') {
    callback = options;
    options = null;
  }
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  var body = (parameterGroupingPostRequiredParameters ? parameterGroupingPostRequiredParameters.body : undefined);
  var customHeader = (parameterGroupingPostRequiredParameters ? parameterGroupingPostRequiredParameters.customHeader : undefined);
  var query = (parameterGroupingPostRequiredParameters ? parameterGroupingPostRequiredParameters.query : undefined);
  var path = (parameterGroupingPostRequiredParameters ? parameterGroupingPostRequiredParameters.path : undefined);
  // Validate
  try {
    if (this.client.acceptLanguage !== null && this.client.acceptLanguage !== undefined && typeof this.client.acceptLanguage.valueOf() !== 'string') {
      throw new Error('this.client.acceptLanguage must be of type string.');
    }
    if (body === null || body === undefined || typeof body !== 'number') {
      throw new Error('body cannot be null or undefined and it must be of type number.');
    }
    if (customHeader !== null && customHeader !== undefined && typeof customHeader.valueOf() !== 'string') {
      throw new Error('customHeader must be of type string.');
    }
    if (query !== null && query !== undefined && typeof query !== 'number') {
      throw new Error('query must be of type number.');
    }
    if (path === null || path === undefined || typeof path.valueOf() !== 'string') {
      throw new Error('path cannot be null or undefined and it must be of type string.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri +
                   '//parameterGrouping/postRequired/{path}';
  requestUrl = requestUrl.replace('{path}', encodeURIComponent(path));
  var queryParameters = [];
  if (query !== null && query !== undefined) {
    queryParameters.push('query=' + encodeURIComponent(query.toString()));
  }
  if (queryParameters.length > 0) {
    requestUrl += '?' + queryParameters.join('&');
  }
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  httpRequest.headers['x-ms-client-request-id'] = msRestAzure.generateUuid();
  if (this.client.acceptLanguage !== undefined && this.client.acceptLanguage !== null) {
    httpRequest.headers['accept-language'] = this.client.acceptLanguage;
  }
  if (customHeader !== undefined && customHeader !== null) {
    httpRequest.headers['customHeader'] = customHeader;
  }
  if(options) {
    for(var headerName in options['customHeaders']) {
      if (options['customHeaders'].hasOwnProperty(headerName)) {
        httpRequest.headers[headerName] = options['customHeaders'][headerName];
      }
    }
  }
  httpRequest.headers['Content-Type'] = 'application/json; charset=utf-8';
  // Serialize Request
  var requestContent = null;
  var requestModel = null;
  try {
    if (body === null || body === undefined || typeof body !== 'number') {
      throw new Error('body cannot be null or undefined and it must be of type number.');
    }
    requestModel = body;
    requestContent = JSON.stringify(requestModel);
  } catch (error) {
    var serializationError = new Error(util.format('Error "%s" occurred in serializing the payload - "%s"', error, util.inspect(requestModel, {depth: null})));
    return callback(serializationError);
  }
  httpRequest.body = requestContent;
  httpRequest.headers['Content-Length'] = Buffer.isBuffer(requestContent) ? requestContent.length : Buffer.byteLength(requestContent, 'UTF8');
  // Send Request
  return client.pipeline(httpRequest, function (err, response, responseBody) {
    if (err) {
      return callback(err);
    }
    var statusCode = response.statusCode;
    if (statusCode !== 200) {
      var error = new Error(responseBody);
      error.statusCode = response.statusCode;
      error.request = httpRequest;
      error.response = response;
      if (responseBody === '') responseBody = null;
      var parsedErrorResponse;
      try {
        parsedErrorResponse = JSON.parse(responseBody);
        error.body = new client._models['ErrorModel']();
        if (parsedErrorResponse !== null && parsedErrorResponse !== undefined) {
          error.body.deserialize(parsedErrorResponse);
        }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = null;
    if (responseBody === '') responseBody = null;

    return callback(null, result, httpRequest, response);
  });
};

/**
 * Post a bunch of optional parameters grouped
 *
 * @param {object} [parameterGroupingPostOptionalParameters] Additional
 * parameters for the operation
 * 
 * @param {string} [parameterGroupingPostOptionalParameters.customHeader]
 * 
 * @param {number} [parameterGroupingPostOptionalParameters.query] Query
 * parameter with default
 * 
 * @param {object} [options]
 *
 * @param {object} [options.customHeaders] headers that will be added to
 * request
 *
 * @param {function} callback
 *
 * @returns {function} callback(err, result, request, response)
 *
 *                      {Error}  err        - The Error object if an error occurred, null otherwise.
 *
 *                      {null} [result]   - The deserialized result object.
 *
 *                      {object} [request]  - The HTTP Request object if an error did not occur.
 *
 *                      {stream} [response] - The HTTP Response stream if an error did not occur.
 */
ParameterGrouping.prototype.postOptional = function (parameterGroupingPostOptionalParameters, options, callback) {
  var client = this.client;
  if(!callback && typeof options === 'function') {
    callback = options;
    options = null;
  }
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  var customHeader = (parameterGroupingPostOptionalParameters ? parameterGroupingPostOptionalParameters.customHeader : undefined);
  var query = (parameterGroupingPostOptionalParameters ? parameterGroupingPostOptionalParameters.query : undefined);
  // Validate
  try {
    if (this.client.acceptLanguage !== null && this.client.acceptLanguage !== undefined && typeof this.client.acceptLanguage.valueOf() !== 'string') {
      throw new Error('this.client.acceptLanguage must be of type string.');
    }
    if (customHeader !== null && customHeader !== undefined && typeof customHeader.valueOf() !== 'string') {
      throw new Error('customHeader must be of type string.');
    }
    if (query !== null && query !== undefined && typeof query !== 'number') {
      throw new Error('query must be of type number.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri +
                   '//parameterGrouping/postOptional';
  var queryParameters = [];
  if (query !== null && query !== undefined) {
    queryParameters.push('query=' + encodeURIComponent(query.toString()));
  }
  if (queryParameters.length > 0) {
    requestUrl += '?' + queryParameters.join('&');
  }
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  httpRequest.headers['x-ms-client-request-id'] = msRestAzure.generateUuid();
  if (this.client.acceptLanguage !== undefined && this.client.acceptLanguage !== null) {
    httpRequest.headers['accept-language'] = this.client.acceptLanguage;
  }
  if (customHeader !== undefined && customHeader !== null) {
    httpRequest.headers['customHeader'] = customHeader;
  }
  if(options) {
    for(var headerName in options['customHeaders']) {
      if (options['customHeaders'].hasOwnProperty(headerName)) {
        httpRequest.headers[headerName] = options['customHeaders'][headerName];
      }
    }
  }
  httpRequest.headers['Content-Type'] = 'application/json; charset=utf-8';
  httpRequest.body = null;
  httpRequest.headers['Content-Length'] = 0;
  // Send Request
  return client.pipeline(httpRequest, function (err, response, responseBody) {
    if (err) {
      return callback(err);
    }
    var statusCode = response.statusCode;
    if (statusCode !== 200) {
      var error = new Error(responseBody);
      error.statusCode = response.statusCode;
      error.request = httpRequest;
      error.response = response;
      if (responseBody === '') responseBody = null;
      var parsedErrorResponse;
      try {
        parsedErrorResponse = JSON.parse(responseBody);
        error.body = new client._models['ErrorModel']();
        if (parsedErrorResponse !== null && parsedErrorResponse !== undefined) {
          error.body.deserialize(parsedErrorResponse);
        }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = null;
    if (responseBody === '') responseBody = null;

    return callback(null, result, httpRequest, response);
  });
};

/**
 * Post parameters from multiple different parameter groups
 *
 * @param {object} [firstParameterGroup] Additional parameters for the
 * operation
 * 
 * @param {string} [firstParameterGroup.headerOne]
 * 
 * @param {number} [firstParameterGroup.queryOne] Query parameter with default
 * 
 * @param {object} [secondParameterGroup] Additional parameters for the
 * operation
 * 
 * @param {string} [secondParameterGroup.headerTwo]
 * 
 * @param {number} [secondParameterGroup.queryTwo] Query parameter with default
 * 
 * @param {object} [options]
 *
 * @param {object} [options.customHeaders] headers that will be added to
 * request
 *
 * @param {function} callback
 *
 * @returns {function} callback(err, result, request, response)
 *
 *                      {Error}  err        - The Error object if an error occurred, null otherwise.
 *
 *                      {null} [result]   - The deserialized result object.
 *
 *                      {object} [request]  - The HTTP Request object if an error did not occur.
 *
 *                      {stream} [response] - The HTTP Response stream if an error did not occur.
 */
ParameterGrouping.prototype.postMultipleParameterGroups = function (firstParameterGroup, secondParameterGroup, options, callback) {
  var client = this.client;
  if(!callback && typeof options === 'function') {
    callback = options;
    options = null;
  }
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  var headerOne = (firstParameterGroup ? firstParameterGroup.headerOne : undefined);
  var queryOne = (firstParameterGroup ? firstParameterGroup.queryOne : undefined);
  var headerTwo = (secondParameterGroup ? secondParameterGroup.headerTwo : undefined);
  var queryTwo = (secondParameterGroup ? secondParameterGroup.queryTwo : undefined);
  // Validate
  try {
    if (this.client.acceptLanguage !== null && this.client.acceptLanguage !== undefined && typeof this.client.acceptLanguage.valueOf() !== 'string') {
      throw new Error('this.client.acceptLanguage must be of type string.');
    }
    if (headerOne !== null && headerOne !== undefined && typeof headerOne.valueOf() !== 'string') {
      throw new Error('headerOne must be of type string.');
    }
    if (queryOne !== null && queryOne !== undefined && typeof queryOne !== 'number') {
      throw new Error('queryOne must be of type number.');
    }
    if (headerTwo !== null && headerTwo !== undefined && typeof headerTwo.valueOf() !== 'string') {
      throw new Error('headerTwo must be of type string.');
    }
    if (queryTwo !== null && queryTwo !== undefined && typeof queryTwo !== 'number') {
      throw new Error('queryTwo must be of type number.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri +
                   '//parameterGrouping/postMultipleParameterGroups';
  var queryParameters = [];
  if (queryOne !== null && queryOne !== undefined) {
    queryParameters.push('query-one=' + encodeURIComponent(queryOne.toString()));
  }
  if (queryTwo !== null && queryTwo !== undefined) {
    queryParameters.push('query-two=' + encodeURIComponent(queryTwo.toString()));
  }
  if (queryParameters.length > 0) {
    requestUrl += '?' + queryParameters.join('&');
  }
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'POST';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  httpRequest.headers['x-ms-client-request-id'] = msRestAzure.generateUuid();
  if (this.client.acceptLanguage !== undefined && this.client.acceptLanguage !== null) {
    httpRequest.headers['accept-language'] = this.client.acceptLanguage;
  }
  if (headerOne !== undefined && headerOne !== null) {
    httpRequest.headers['header-one'] = headerOne;
  }
  if (headerTwo !== undefined && headerTwo !== null) {
    httpRequest.headers['header-two'] = headerTwo;
  }
  if(options) {
    for(var headerName in options['customHeaders']) {
      if (options['customHeaders'].hasOwnProperty(headerName)) {
        httpRequest.headers[headerName] = options['customHeaders'][headerName];
      }
    }
  }
  httpRequest.headers['Content-Type'] = 'application/json; charset=utf-8';
  httpRequest.body = null;
  httpRequest.headers['Content-Length'] = 0;
  // Send Request
  return client.pipeline(httpRequest, function (err, response, responseBody) {
    if (err) {
      return callback(err);
    }
    var statusCode = response.statusCode;
    if (statusCode !== 200) {
      var error = new Error(responseBody);
      error.statusCode = response.statusCode;
      error.request = httpRequest;
      error.response = response;
      if (responseBody === '') responseBody = null;
      var parsedErrorResponse;
      try {
        parsedErrorResponse = JSON.parse(responseBody);
        error.body = new client._models['ErrorModel']();
        if (parsedErrorResponse !== null && parsedErrorResponse !== undefined) {
          error.body.deserialize(parsedErrorResponse);
        }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = null;
    if (responseBody === '') responseBody = null;

    return callback(null, result, httpRequest, response);
  });
};


module.exports = ParameterGrouping;
