package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.SettableFuture;

import com.mypurecloud.sdk.v2.AsyncApiCallback;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.UserScheduleAdherence;
import com.mypurecloud.sdk.v2.model.ActivityCodeContainer;
import com.mypurecloud.sdk.v2.model.WfmIntradayQueueListing;
import com.mypurecloud.sdk.v2.model.TimeOffRequest;
import com.mypurecloud.sdk.v2.model.TimeOffRequestList;
import com.mypurecloud.sdk.v2.model.WfmUserEntityListing;
import com.mypurecloud.sdk.v2.model.ManagementUnitListing;
import com.mypurecloud.sdk.v2.model.ActivityCode;
import com.mypurecloud.sdk.v2.model.CreateActivityCodeRequest;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceResponse;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceQuery;
import com.mypurecloud.sdk.v2.model.IntradayResponse;
import com.mypurecloud.sdk.v2.model.IntradayQueryDataCommand;
import com.mypurecloud.sdk.v2.model.UserScheduleContainer;
import com.mypurecloud.sdk.v2.model.UserListScheduleRequestBody;


import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementAdherenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitActivitycodesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitIntradayQueuesRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitUserTimeoffrequestRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitUserTimeoffrequestsRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitUsersRequest;
import com.mypurecloud.sdk.v2.api.request.GetWorkforcemanagementManagementunitsRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitActivitycodesRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitIntradayRequest;
import com.mypurecloud.sdk.v2.api.request.PostWorkforcemanagementManagementunitSchedulesSearchRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class WorkforceManagementApiAsync {
  private final ApiClient pcapiClient;

  public WorkforceManagementApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkforceManagementApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Get a list of UserScheduleAdherence records for the requested users
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<List<UserScheduleAdherence>> getWorkforcemanagementAdherenceAsync(GetWorkforcemanagementAdherenceRequest request, final AsyncApiCallback<List<UserScheduleAdherence>> callback) {
    try {
      final SettableFuture<List<UserScheduleAdherence>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<List<UserScheduleAdherence>>() {}, new AsyncApiCallback<ApiResponse<List<UserScheduleAdherence>>>() {
        @Override
        public void onCompleted(ApiResponse<List<UserScheduleAdherence>> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of UserScheduleAdherence records for the requested users
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<List<UserScheduleAdherence>>> getWorkforcemanagementAdherenceAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<List<UserScheduleAdherence>>> callback) {
    try {
      final SettableFuture<ApiResponse<List<UserScheduleAdherence>>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<List<UserScheduleAdherence>>() {}, new AsyncApiCallback<ApiResponse<List<UserScheduleAdherence>>>() {
        @Override
        public void onCompleted(ApiResponse<List<UserScheduleAdherence>> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<List<UserScheduleAdherence>> response = (ApiResponse<List<UserScheduleAdherence>>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<List<UserScheduleAdherence>> response = (ApiResponse<List<UserScheduleAdherence>>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get activity codes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActivityCodeContainer> getWorkforcemanagementManagementunitActivitycodesAsync(GetWorkforcemanagementManagementunitActivitycodesRequest request, final AsyncApiCallback<ActivityCodeContainer> callback) {
    try {
      final SettableFuture<ActivityCodeContainer> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActivityCodeContainer>() {}, new AsyncApiCallback<ApiResponse<ActivityCodeContainer>>() {
        @Override
        public void onCompleted(ApiResponse<ActivityCodeContainer> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get activity codes
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ActivityCodeContainer>> getWorkforcemanagementManagementunitActivitycodesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ActivityCodeContainer>> callback) {
    try {
      final SettableFuture<ApiResponse<ActivityCodeContainer>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActivityCodeContainer>() {}, new AsyncApiCallback<ApiResponse<ActivityCodeContainer>>() {
        @Override
        public void onCompleted(ApiResponse<ActivityCodeContainer> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActivityCodeContainer> response = (ApiResponse<ActivityCodeContainer>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActivityCodeContainer> response = (ApiResponse<ActivityCodeContainer>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get intraday queues for the given date
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WfmIntradayQueueListing> getWorkforcemanagementManagementunitIntradayQueuesAsync(GetWorkforcemanagementManagementunitIntradayQueuesRequest request, final AsyncApiCallback<WfmIntradayQueueListing> callback) {
    try {
      final SettableFuture<WfmIntradayQueueListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WfmIntradayQueueListing>() {}, new AsyncApiCallback<ApiResponse<WfmIntradayQueueListing>>() {
        @Override
        public void onCompleted(ApiResponse<WfmIntradayQueueListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get intraday queues for the given date
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WfmIntradayQueueListing>> getWorkforcemanagementManagementunitIntradayQueuesAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WfmIntradayQueueListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WfmIntradayQueueListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WfmIntradayQueueListing>() {}, new AsyncApiCallback<ApiResponse<WfmIntradayQueueListing>>() {
        @Override
        public void onCompleted(ApiResponse<WfmIntradayQueueListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WfmIntradayQueueListing> response = (ApiResponse<WfmIntradayQueueListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WfmIntradayQueueListing> response = (ApiResponse<WfmIntradayQueueListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a time off request by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffRequest> getWorkforcemanagementManagementunitUserTimeoffrequestAsync(GetWorkforcemanagementManagementunitUserTimeoffrequestRequest request, final AsyncApiCallback<TimeOffRequest> callback) {
    try {
      final SettableFuture<TimeOffRequest> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffRequest>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequest>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequest> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a time off request by id
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffRequest>> getWorkforcemanagementManagementunitUserTimeoffrequestAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TimeOffRequest>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeOffRequest>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffRequest>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequest>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequest> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequest> response = (ApiResponse<TimeOffRequest>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequest> response = (ApiResponse<TimeOffRequest>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get a list of time off requests for any user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<TimeOffRequestList> getWorkforcemanagementManagementunitUserTimeoffrequestsAsync(GetWorkforcemanagementManagementunitUserTimeoffrequestsRequest request, final AsyncApiCallback<TimeOffRequestList> callback) {
    try {
      final SettableFuture<TimeOffRequestList> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<TimeOffRequestList>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestList>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestList> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get a list of time off requests for any user
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<TimeOffRequestList>> getWorkforcemanagementManagementunitUserTimeoffrequestsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<TimeOffRequestList>> callback) {
    try {
      final SettableFuture<ApiResponse<TimeOffRequestList>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<TimeOffRequestList>() {}, new AsyncApiCallback<ApiResponse<TimeOffRequestList>>() {
        @Override
        public void onCompleted(ApiResponse<TimeOffRequestList> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestList> response = (ApiResponse<TimeOffRequestList>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<TimeOffRequestList> response = (ApiResponse<TimeOffRequestList>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get agents in the management unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WfmUserEntityListing> getWorkforcemanagementManagementunitUsersAsync(GetWorkforcemanagementManagementunitUsersRequest request, final AsyncApiCallback<WfmUserEntityListing> callback) {
    try {
      final SettableFuture<WfmUserEntityListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WfmUserEntityListing>() {}, new AsyncApiCallback<ApiResponse<WfmUserEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WfmUserEntityListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get agents in the management unit
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WfmUserEntityListing>> getWorkforcemanagementManagementunitUsersAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<WfmUserEntityListing>> callback) {
    try {
      final SettableFuture<ApiResponse<WfmUserEntityListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WfmUserEntityListing>() {}, new AsyncApiCallback<ApiResponse<WfmUserEntityListing>>() {
        @Override
        public void onCompleted(ApiResponse<WfmUserEntityListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WfmUserEntityListing> response = (ApiResponse<WfmUserEntityListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WfmUserEntityListing> response = (ApiResponse<WfmUserEntityListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get management units
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ManagementUnitListing> getWorkforcemanagementManagementunitsAsync(GetWorkforcemanagementManagementunitsRequest request, final AsyncApiCallback<ManagementUnitListing> callback) {
    try {
      final SettableFuture<ManagementUnitListing> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ManagementUnitListing>() {}, new AsyncApiCallback<ApiResponse<ManagementUnitListing>>() {
        @Override
        public void onCompleted(ApiResponse<ManagementUnitListing> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get management units
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ManagementUnitListing>> getWorkforcemanagementManagementunitsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<ManagementUnitListing>> callback) {
    try {
      final SettableFuture<ApiResponse<ManagementUnitListing>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ManagementUnitListing>() {}, new AsyncApiCallback<ApiResponse<ManagementUnitListing>>() {
        @Override
        public void onCompleted(ApiResponse<ManagementUnitListing> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ManagementUnitListing> response = (ApiResponse<ManagementUnitListing>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ManagementUnitListing> response = (ApiResponse<ManagementUnitListing>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Create a new activity code
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ActivityCode> postWorkforcemanagementManagementunitActivitycodesAsync(PostWorkforcemanagementManagementunitActivitycodesRequest request, final AsyncApiCallback<ActivityCode> callback) {
    try {
      final SettableFuture<ActivityCode> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<ActivityCode>() {}, new AsyncApiCallback<ApiResponse<ActivityCode>>() {
        @Override
        public void onCompleted(ApiResponse<ActivityCode> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create a new activity code
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<ActivityCode>> postWorkforcemanagementManagementunitActivitycodesAsync(ApiRequest<CreateActivityCodeRequest> request, final AsyncApiCallback<ApiResponse<ActivityCode>> callback) {
    try {
      final SettableFuture<ApiResponse<ActivityCode>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<ActivityCode>() {}, new AsyncApiCallback<ApiResponse<ActivityCode>>() {
        @Override
        public void onCompleted(ApiResponse<ActivityCode> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<ActivityCode> response = (ApiResponse<ActivityCode>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<ActivityCode> response = (ApiResponse<ActivityCode>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Request a historical adherence report
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<WfmHistoricalAdherenceResponse> postWorkforcemanagementManagementunitHistoricaladherencequeryAsync(PostWorkforcemanagementManagementunitHistoricaladherencequeryRequest request, final AsyncApiCallback<WfmHistoricalAdherenceResponse> callback) {
    try {
      final SettableFuture<WfmHistoricalAdherenceResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<WfmHistoricalAdherenceResponse>() {}, new AsyncApiCallback<ApiResponse<WfmHistoricalAdherenceResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WfmHistoricalAdherenceResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Request a historical adherence report
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<WfmHistoricalAdherenceResponse>> postWorkforcemanagementManagementunitHistoricaladherencequeryAsync(ApiRequest<WfmHistoricalAdherenceQuery> request, final AsyncApiCallback<ApiResponse<WfmHistoricalAdherenceResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<WfmHistoricalAdherenceResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<WfmHistoricalAdherenceResponse>() {}, new AsyncApiCallback<ApiResponse<WfmHistoricalAdherenceResponse>>() {
        @Override
        public void onCompleted(ApiResponse<WfmHistoricalAdherenceResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<WfmHistoricalAdherenceResponse> response = (ApiResponse<WfmHistoricalAdherenceResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<WfmHistoricalAdherenceResponse> response = (ApiResponse<WfmHistoricalAdherenceResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get intraday data for the given date for the requested queueIds
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<IntradayResponse> postWorkforcemanagementManagementunitIntradayAsync(PostWorkforcemanagementManagementunitIntradayRequest request, final AsyncApiCallback<IntradayResponse> callback) {
    try {
      final SettableFuture<IntradayResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<IntradayResponse>() {}, new AsyncApiCallback<ApiResponse<IntradayResponse>>() {
        @Override
        public void onCompleted(ApiResponse<IntradayResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get intraday data for the given date for the requested queueIds
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<IntradayResponse>> postWorkforcemanagementManagementunitIntradayAsync(ApiRequest<IntradayQueryDataCommand> request, final AsyncApiCallback<ApiResponse<IntradayResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<IntradayResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<IntradayResponse>() {}, new AsyncApiCallback<ApiResponse<IntradayResponse>>() {
        @Override
        public void onCompleted(ApiResponse<IntradayResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<IntradayResponse> response = (ApiResponse<IntradayResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<IntradayResponse> response = (ApiResponse<IntradayResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get user schedules within the given time range
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<UserScheduleContainer> postWorkforcemanagementManagementunitSchedulesSearchAsync(PostWorkforcemanagementManagementunitSchedulesSearchRequest request, final AsyncApiCallback<UserScheduleContainer> callback) {
    try {
      final SettableFuture<UserScheduleContainer> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<UserScheduleContainer>() {}, new AsyncApiCallback<ApiResponse<UserScheduleContainer>>() {
        @Override
        public void onCompleted(ApiResponse<UserScheduleContainer> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get user schedules within the given time range
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<UserScheduleContainer>> postWorkforcemanagementManagementunitSchedulesSearchAsync(ApiRequest<UserListScheduleRequestBody> request, final AsyncApiCallback<ApiResponse<UserScheduleContainer>> callback) {
    try {
      final SettableFuture<ApiResponse<UserScheduleContainer>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<UserScheduleContainer>() {}, new AsyncApiCallback<ApiResponse<UserScheduleContainer>>() {
        @Override
        public void onCompleted(ApiResponse<UserScheduleContainer> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<UserScheduleContainer> response = (ApiResponse<UserScheduleContainer>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<UserScheduleContainer> response = (ApiResponse<UserScheduleContainer>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  

  private <T> void notifySuccess(SettableFuture<T> future, AsyncApiCallback<T> callback, T result) {
    if (callback != null) {
      try {
        callback.onCompleted(result);
        future.set(result);
      }
      catch (Throwable exception) {
        future.setException(exception);
      }
    }
    else {
      future.set(result);
    }
  }

  private <T> void notifyFailure(SettableFuture<T> future, AsyncApiCallback<T> callback, Throwable exception) {
    if (callback != null) {
      try {
        callback.onFailed(exception);
        future.setException(exception);
      }
      catch (Throwable callbackException) {
        future.setException(callbackException);
      }
    }
    else {
      future.setException(exception);
    }
  }
}
