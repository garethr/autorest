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

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.ServiceResponseEmptyCallback;
import com.squareup.okhttp.ResponseBody;
import retrofit.Retrofit;
import retrofit.Call;
import retrofit.Response;
import fixtures.bodycomplex.models.Fish;
import fixtures.bodycomplex.models.Error;
import com.microsoft.rest.Validator;

public class PolymorphismImpl implements Polymorphism {
    private PolymorphismService service;
    AutoRestComplexTestService client;

    public PolymorphismImpl(Retrofit retrofit, AutoRestComplexTestService client) {
        this.service = retrofit.create(PolymorphismService.class);
        this.client = client;
    }

    /**
     * Get complex types that are polymorphic
     *
     * @return the Fish object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Fish getValid() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getValid();
            ServiceResponse<Fish> response = getValidDelegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get complex types that are polymorphic
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getValidAsync(final ServiceCallback<Fish> serviceCallback) {
        Call<ResponseBody> call = service.getValid();
        call.enqueue(new ServiceResponseCallback<Fish>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getValidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Fish> getValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Fish>()
                .register(200, new TypeToken<Fish>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Put complex types that are polymorphic
     *
     * @param complexBody Please put a salmon that looks like this:
     {
             'dtype':'Salmon',
             'location':'alaska',
             'iswild':true,
             'species':'king',
             'length':1.0,
             'siblings':[
               {
                 'dtype':'Shark',
                 'age':6,
                 'birthday': '2012-01-05T01:00:00Z',
                 'length':20.0,
                 'species':'predator',
               },
               {
                 'dtype':'Sawshark',
                 'age':105,
                 'birthday': '1900-01-05T01:00:00Z',
                 'length':10.0,
                 'picture': new Buffer([255, 255, 255, 255, 254]).toString('base64'),
                 'species':'dangerous',
               }
             ]
           };
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putValid(Fish complexBody) throws ServiceException {
        if (complexBody == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter complexBody is required and cannot be null."));
        }
        Validator.validate(complexBody);
        try {
            Call<ResponseBody> call = service.putValid(complexBody);
            ServiceResponse<Void> response = putValidDelegate(call.execute(), null);
            response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Put complex types that are polymorphic
     *
     * @param complexBody Please put a salmon that looks like this:
     {
             'dtype':'Salmon',
             'location':'alaska',
             'iswild':true,
             'species':'king',
             'length':1.0,
             'siblings':[
               {
                 'dtype':'Shark',
                 'age':6,
                 'birthday': '2012-01-05T01:00:00Z',
                 'length':20.0,
                 'species':'predator',
               },
               {
                 'dtype':'Sawshark',
                 'age':105,
                 'birthday': '1900-01-05T01:00:00Z',
                 'length':10.0,
                 'picture': new Buffer([255, 255, 255, 255, 254]).toString('base64'),
                 'species':'dangerous',
               }
             ]
           };
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> putValidAsync(Fish complexBody, final ServiceCallback<Void> serviceCallback) {
        if (complexBody == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter complexBody is required and cannot be null.")));
        }
        Validator.validate(complexBody, serviceCallback);
        Call<ResponseBody> call = service.putValid(complexBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putValidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Put complex types that are polymorphic, attempting to omit required 'birthday' field - the request should not be allowed from the client
     *
     * @param complexBody Please attempt put a sawshark that looks like this, the client should not allow this data to be sent:
     {
         "dtype": "sawshark",
         "species": "snaggle toothed",
         "length": 18.5,
         "age": 2,
         "birthday": "2013-06-01T01:00:00Z",
         "location": "alaska",
         "picture": base64(FF FF FF FF FE),
         "siblings": [
             {
                 "dtype": "shark",
                 "species": "predator",
                 "birthday": "2012-01-05T01:00:00Z",
                 "length": 20,
                 "age": 6
             },
             {
                 "dtype": "sawshark",
                 "species": "dangerous",
                 "picture": base64(FF FF FF FF FE),
                 "length": 10,
                 "age": 105
             }
         ]
     }
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putValidMissingRequired(Fish complexBody) throws ServiceException {
        if (complexBody == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter complexBody is required and cannot be null."));
        }
        Validator.validate(complexBody);
        try {
            Call<ResponseBody> call = service.putValidMissingRequired(complexBody);
            ServiceResponse<Void> response = putValidMissingRequiredDelegate(call.execute(), null);
            response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Put complex types that are polymorphic, attempting to omit required 'birthday' field - the request should not be allowed from the client
     *
     * @param complexBody Please attempt put a sawshark that looks like this, the client should not allow this data to be sent:
     {
         "dtype": "sawshark",
         "species": "snaggle toothed",
         "length": 18.5,
         "age": 2,
         "birthday": "2013-06-01T01:00:00Z",
         "location": "alaska",
         "picture": base64(FF FF FF FF FE),
         "siblings": [
             {
                 "dtype": "shark",
                 "species": "predator",
                 "birthday": "2012-01-05T01:00:00Z",
                 "length": 20,
                 "age": 6
             },
             {
                 "dtype": "sawshark",
                 "species": "dangerous",
                 "picture": base64(FF FF FF FF FE),
                 "length": 10,
                 "age": 105
             }
         ]
     }
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> putValidMissingRequiredAsync(Fish complexBody, final ServiceCallback<Void> serviceCallback) {
        if (complexBody == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter complexBody is required and cannot be null.")));
        }
        Validator.validate(complexBody, serviceCallback);
        Call<ResponseBody> call = service.putValidMissingRequired(complexBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putValidMissingRequiredDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putValidMissingRequiredDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

}
