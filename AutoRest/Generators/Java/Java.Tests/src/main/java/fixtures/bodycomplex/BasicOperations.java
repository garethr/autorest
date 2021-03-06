/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import retrofit.Call;
import com.squareup.okhttp.ResponseBody;
import fixtures.bodycomplex.models.Basic;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;

/**
 * An instance of this class provides access to all the operations defined
 * in BasicOperations.
 */
public interface BasicOperations {
    /**
     * The interface defining all the services for BasicOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BasicService {
        @GET("/complex/basic/valid")
        Call<ResponseBody> getValid();

        @PUT("/complex/basic/valid")
        Call<ResponseBody> putValid(@Body Basic complexBody);

        @GET("/complex/basic/invalid")
        Call<ResponseBody> getInvalid();

        @GET("/complex/basic/empty")
        Call<ResponseBody> getEmpty();

        @GET("/complex/basic/null")
        Call<ResponseBody> getNull();

        @GET("/complex/basic/notprovided")
        Call<ResponseBody> getNotProvided();

    }
    /**
     * Get complex type {id: 2, name: 'abc', color: 'YELLOW'}
     *
     * @return the Basic object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Basic getValid() throws ServiceException;

    /**
     * Get complex type {id: 2, name: 'abc', color: 'YELLOW'}
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getValidAsync(final ServiceCallback<Basic> serviceCallback);

    /**
     * Please put {id: 2, name: 'abc', color: 'Magenta'}
     *
     * @param complexBody Please put {id: 2, name: 'abc', color: 'Magenta'}
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putValid(Basic complexBody) throws ServiceException;

    /**
     * Please put {id: 2, name: 'abc', color: 'Magenta'}
     *
     * @param complexBody Please put {id: 2, name: 'abc', color: 'Magenta'}
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putValidAsync(Basic complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a basic complex type that is invalid for the local strong type
     *
     * @return the Basic object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Basic getInvalid() throws ServiceException;

    /**
     * Get a basic complex type that is invalid for the local strong type
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getInvalidAsync(final ServiceCallback<Basic> serviceCallback);

    /**
     * Get a basic complex type that is empty
     *
     * @return the Basic object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Basic getEmpty() throws ServiceException;

    /**
     * Get a basic complex type that is empty
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getEmptyAsync(final ServiceCallback<Basic> serviceCallback);

    /**
     * Get a basic complex type whose properties are null
     *
     * @return the Basic object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Basic getNull() throws ServiceException;

    /**
     * Get a basic complex type whose properties are null
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getNullAsync(final ServiceCallback<Basic> serviceCallback);

    /**
     * Get a basic complex type while the server doesn't provide a response payload
     *
     * @return the Basic object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Basic getNotProvided() throws ServiceException;

    /**
     * Get a basic complex type while the server doesn't provide a response payload
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getNotProvidedAsync(final ServiceCallback<Basic> serviceCallback);

}
