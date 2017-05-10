package com.mypurecloud.sdk.v2.api.request;

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

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExternalContact;
import com.mypurecloud.sdk.v2.model.Note;
import com.mypurecloud.sdk.v2.model.NoteListing;
import com.mypurecloud.sdk.v2.model.ContactListing;
import com.mypurecloud.sdk.v2.model.DataSchema;
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import com.mypurecloud.sdk.v2.model.RelationshipListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationListing;
import com.mypurecloud.sdk.v2.model.Relationship;
import com.mypurecloud.sdk.v2.model.ReverseWhitepagesLookupResult;
import com.mypurecloud.sdk.v2.model.ConversationAssociation;

public class PutExternalcontactsOrganizationsSchemaRequest {
	private String schemaId;
	public String getSchemaId() {
		return this.schemaId;
	}

	public void setSchemaId(String schemaId) {
		this.schemaId = schemaId;
	}

	public PutExternalcontactsOrganizationsSchemaRequest withSchemaId(String schemaId) {
	    this.setSchemaId(schemaId);
	    return this;
	}

	private DataSchema body;
	public DataSchema getBody() {
		return this.body;
	}

	public void setBody(DataSchema body) {
		this.body = body;
	}

	public PutExternalcontactsOrganizationsSchemaRequest withBody(DataSchema body) {
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

    public PutExternalcontactsOrganizationsSchemaRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<DataSchema> withHttpInfo() {
        
        // verify the required parameter 'schemaId' is set
        if (this.schemaId == null) {
            throw new IllegalStateException("Missing the required parameter 'schemaId' when building request for PutExternalcontactsOrganizationsSchemaRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutExternalcontactsOrganizationsSchemaRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/externalcontacts/organizations/schemas/{schemaId}")
                .withPathParameter("schemaId", schemaId)
        
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

	public static Builder builder(String schemaId, DataSchema body) {
	    return new Builder()
	            .withRequiredParams(schemaId, body);
	}

	public static class Builder {
		private final PutExternalcontactsOrganizationsSchemaRequest request;

		private Builder() {
			request = new PutExternalcontactsOrganizationsSchemaRequest();
		}

		public Builder withSchemaId(String schemaId) {
			request.setSchemaId(schemaId);
			return this;
		}
		public Builder withBody(DataSchema body) {
			request.setBody(body);
			return this;
		}

		public Builder withRequiredParams(String schemaId, DataSchema body) {
			request.setSchemaId(schemaId);
			request.setBody(body);
			return this;
		}


		public PutExternalcontactsOrganizationsSchemaRequest build() {
            
            // verify the required parameter 'schemaId' is set
            if (request.schemaId == null) {
                throw new IllegalStateException("Missing the required parameter 'schemaId' when building request for PutExternalcontactsOrganizationsSchemaRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutExternalcontactsOrganizationsSchemaRequest.");
            }
            
			return request;
		}
	}
}