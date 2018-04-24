package com.mypurecloud.sdk.v2.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiRequestBuilder;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import com.mypurecloud.sdk.v2.model.Integration;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.IntegrationConfiguration;
import com.mypurecloud.sdk.v2.model.IntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.Action;
import com.mypurecloud.sdk.v2.model.JsonSchemaDocument;
import com.mypurecloud.sdk.v2.model.DraftValidationResult;
import com.mypurecloud.sdk.v2.model.ActionEntityListing;
import com.mypurecloud.sdk.v2.model.CategoryEntityListing;
import com.mypurecloud.sdk.v2.model.ClientAppEntityListing;
import com.mypurecloud.sdk.v2.model.Credential;
import com.mypurecloud.sdk.v2.model.CredentialInfoListing;
import com.mypurecloud.sdk.v2.model.CredentialTypeListing;
import com.mypurecloud.sdk.v2.model.IntegrationEventEntityListing;
import com.mypurecloud.sdk.v2.model.IntegrationEvent;
import com.mypurecloud.sdk.v2.model.IntegrationType;
import com.mypurecloud.sdk.v2.model.IntegrationTypeEntityListing;
import com.mypurecloud.sdk.v2.model.UpdateActionInput;
import com.mypurecloud.sdk.v2.model.UpdateDraftInput;
import com.mypurecloud.sdk.v2.model.CreateIntegrationRequest;
import com.mypurecloud.sdk.v2.model.PublishDraftInput;
import com.mypurecloud.sdk.v2.model.TestExecutionResult;
import com.mypurecloud.sdk.v2.model.PostActionInput;
import com.mypurecloud.sdk.v2.model.CredentialInfo;
import com.mypurecloud.sdk.v2.model.UserActionCategoryEntityListing;
import com.mypurecloud.sdk.v2.model.VendorConnectionRequest;

public class PutIntegrationConfigCurrentRequest {
    
	private String integrationId;
	public String getIntegrationId() {
		return this.integrationId;
	}

	public void setIntegrationId(String integrationId) {
		this.integrationId = integrationId;
	}

	public PutIntegrationConfigCurrentRequest withIntegrationId(String integrationId) {
	    this.setIntegrationId(integrationId);
	    return this;
	} 
	
	private IntegrationConfiguration body;
	public IntegrationConfiguration getBody() {
		return this.body;
	}

	public void setBody(IntegrationConfiguration body) {
		this.body = body;
	}

	public PutIntegrationConfigCurrentRequest withBody(IntegrationConfiguration body) {
	    this.setBody(body);
	    return this;
	} 
	
	private final Map<String, String> customHeaders = new HashMap<>();
    public Map<String, String> getCustomHeaders() {
        return this.customHeaders;
    }

    public void setCustomHeaders(Map<String, String> customHeaders) {
        this.customHeaders.clear();
        this.customHeaders.putAll(customHeaders);
    }

    public void addCustomHeader(String name, String value) {
        this.customHeaders.put(name, value);
    }

    public PutIntegrationConfigCurrentRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<IntegrationConfiguration> withHttpInfo() {
        
        // verify the required parameter 'integrationId' is set
        if (this.integrationId == null) {
            throw new IllegalStateException("Missing the required parameter 'integrationId' when building request for PutIntegrationConfigCurrentRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/integrations/{integrationId}/config/current")
                .withPathParameter("integrationId", integrationId)
        
                .withBody(body)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String integrationId) {
	    return new Builder()
	            .withRequiredParams(integrationId);
	}
	

	public static class Builder {
		private final PutIntegrationConfigCurrentRequest request;

		private Builder() {
			request = new PutIntegrationConfigCurrentRequest();
		}

		
		public Builder withIntegrationId(String integrationId) {
			request.setIntegrationId(integrationId);
			return this;
		}
		
		public Builder withBody(IntegrationConfiguration body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String integrationId) {
			request.setIntegrationId(integrationId);
			
			return this;
		}
		

		public PutIntegrationConfigCurrentRequest build() {
            
            // verify the required parameter 'integrationId' is set
            if (request.integrationId == null) {
                throw new IllegalStateException("Missing the required parameter 'integrationId' when building request for PutIntegrationConfigCurrentRequest.");
            }
            
			return request;
		}
	}
}
