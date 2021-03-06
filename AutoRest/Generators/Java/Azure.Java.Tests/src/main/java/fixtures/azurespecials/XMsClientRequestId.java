/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import retrofit.Call;
import com.squareup.okhttp.ResponseBody;
import retrofit.http.GET;
import retrofit.http.Header;

/**
 * An instance of this class provides access to all the operations defined
 * in XMsClientRequestId.
 */
public interface XMsClientRequestId {
    /**
     * The interface defining all the services for XMsClientRequestId to be
     * used by Retrofit to perform actually REST calls.
     */
    interface XMsClientRequestIdService {
        @GET("/azurespecials/overwrite/x-ms-client-request-id/method/")
        Call<ResponseBody> get(@Header("accept-language") String acceptLanguage);

        @GET("/azurespecials/overwrite/x-ms-client-request-id/via-param/method/")
        Call<ResponseBody> paramGet(@Header("x-ms-client-request-id") String xMsClientRequestId, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void get() throws ServiceException;

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @param xMsClientRequestId This should appear as a method parameter, use value '9C4D50EE-2D56-4CD3-8152-34347DC9F2B0'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void paramGet(String xMsClientRequestId) throws ServiceException;

    /**
     * Get method that overwrites x-ms-client-request header with value 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     *
     * @param xMsClientRequestId This should appear as a method parameter, use value '9C4D50EE-2D56-4CD3-8152-34347DC9F2B0'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> paramGetAsync(String xMsClientRequestId, final ServiceCallback<Void> serviceCallback);

}
