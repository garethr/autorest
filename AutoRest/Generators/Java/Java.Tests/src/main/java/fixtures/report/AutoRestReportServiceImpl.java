/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.report;

import com.microsoft.rest.ServiceClient;
import com.squareup.okhttp.OkHttpClient;
import retrofit.Retrofit;
import java.math.BigDecimal;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.ServiceResponseEmptyCallback;
import com.squareup.okhttp.ResponseBody;
import retrofit.Call;
import retrofit.Response;
import java.util.Map;
import fixtures.report.models.Error;

/**
 * Initializes a new instance of the AutoRestReportService class.
 */
public class AutoRestReportServiceImpl extends ServiceClient implements AutoRestReportService {
    private AutoRestReportServiceService service;
    private String baseUri;

    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    public String getBaseUri() {
        return this.baseUri;
    }

    /**
     * Initializes an instance of AutoRestReportService client.
     */
    public AutoRestReportServiceImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestReportService client.
     *
     * @param baseUri the base URI of the host
     */
    public AutoRestReportServiceImpl(String baseUri) {
        super();
        this.baseUri = baseUri;
        initialize();
    }

    /**
     * Initializes an instance of AutoRestReportService client.
     *
     * @param baseUri the base URI of the host
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public AutoRestReportServiceImpl(String baseUri, OkHttpClient client, Retrofit.Builder retrofitBuilder) {
        super(client, retrofitBuilder);
        this.baseUri = baseUri;
        initialize();
    }

    private void initialize() {
        Retrofit retrofit = retrofitBuilder.baseUrl(baseUri).build();
        service = retrofit.create(AutoRestReportServiceService.class);
    }

    /**
     * Get test coverage report
     *
     * @return the Map&lt;String, Integer&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Map<String, Integer> getReport() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getReport();
            ServiceResponse<Map<String, Integer>> response = getReportDelegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get test coverage report
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getReportAsync(final ServiceCallback<Map<String, Integer>> serviceCallback) {
        Call<ResponseBody> call = service.getReport();
        call.enqueue(new ServiceResponseCallback<Map<String, Integer>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getReportDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Map<String, Integer>> getReportDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Map<String, Integer>>()
                .register(200, new TypeToken<Map<String, Integer>>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

}
