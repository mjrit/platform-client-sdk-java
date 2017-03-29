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
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import com.mypurecloud.sdk.v2.model.RelationshipListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationListing;
import com.mypurecloud.sdk.v2.model.Relationship;
import com.mypurecloud.sdk.v2.model.ReverseWhitepagesLookupResult;
import com.mypurecloud.sdk.v2.model.ConversationAssociation;

public class PutExternalcontactsRelationshipRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String relationshipId;
	public String getRelationshipId() {
		return this.relationshipId;
	}

	public void setRelationshipId(String relationshipId) {
		this.relationshipId = relationshipId;
	}

	public PutExternalcontactsRelationshipRequest withRelationshipId(String relationshipId) {
	    this.setRelationshipId(relationshipId);
	    return this;
	}

	private Relationship body;
	public Relationship getBody() {
		return this.body;
	}

	public void setBody(Relationship body) {
		this.body = body;
	}

	public PutExternalcontactsRelationshipRequest withBody(Relationship body) {
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

    public PutExternalcontactsRelationshipRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Relationship> withHttpInfo() throws ApiException {
        
        // verify the required parameter 'relationshipId' is set
        if (this.relationshipId == null) {
            throw new ApiException(400, "Missing the required parameter 'relationshipId' when building request for PutExternalcontactsRelationshipRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/externalcontacts/relationships/{relationshipId}")
                .withPathParameter("relationshipId", relationshipId)
        
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

	public static Builder builder(String relationshipId) {
	    return new Builder()
	            .withRequiredParams(relationshipId);
	}

	public static class Builder {
		private final PutExternalcontactsRelationshipRequest request;

		private Builder() {
			request = new PutExternalcontactsRelationshipRequest();
		}

		public Builder withRelationshipId(String relationshipId) {
			request.setRelationshipId(relationshipId);
			return this;
		}
		public Builder withBody(Relationship body) {
			request.setBody(body);
			return this;
		}

		public Builder withRequiredParams(String relationshipId) {
			request.setRelationshipId(relationshipId);
			return this;
		}


		public PutExternalcontactsRelationshipRequest build() {
			return request;
		}
	}
}