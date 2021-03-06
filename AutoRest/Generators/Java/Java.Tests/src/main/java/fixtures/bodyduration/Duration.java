/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyduration;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import retrofit.Call;
import com.squareup.okhttp.ResponseBody;
import org.joda.time.Period;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;

/**
 * An instance of this class provides access to all the operations defined
 * in Duration.
 */
public interface Duration {
    /**
     * The interface defining all the services for Duration to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DurationService {
        @GET("/duration/null")
        Call<ResponseBody> getNull();

        @PUT("/duration/positiveduration")
        Call<ResponseBody> putPositiveDuration(@Body Period durationBody);

        @GET("/duration/positiveduration")
        Call<ResponseBody> getPositiveDuration();

        @GET("/duration/invalid")
        Call<ResponseBody> getInvalid();

    }
    /**
     * Get null duration value
     *
     * @return the Period object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Period getNull() throws ServiceException;

    /**
     * Get null duration value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getNullAsync(final ServiceCallback<Period> serviceCallback);

    /**
     * Put a positive duration value
     *
     * @param durationBody the Period value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putPositiveDuration(Period durationBody) throws ServiceException;

    /**
     * Put a positive duration value
     *
     * @param durationBody the Period value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putPositiveDurationAsync(Period durationBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a positive duration value
     *
     * @return the Period object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Period getPositiveDuration() throws ServiceException;

    /**
     * Get a positive duration value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getPositiveDurationAsync(final ServiceCallback<Period> serviceCallback);

    /**
     * Get an invalid duration value
     *
     * @return the Period object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Period getInvalid() throws ServiceException;

    /**
     * Get an invalid duration value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getInvalidAsync(final ServiceCallback<Period> serviceCallback);

}
