/**
 *
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 *
 */

package com.microsoft.rest;

import retrofit.Response;

public class AzureResponse<T> extends ServiceResponse<T> {
    /**
     * Instantiate a ServiceResponse instance with a response object and a raw REST response
     *
     * @param body     deserialized response object
     * @param response raw REST response
     */
    public AzureResponse(T body, Response response) {
        super(body, response);
    }

    private String requestId;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
