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
import com.mypurecloud.sdk.v2.model.Attribute;
import com.mypurecloud.sdk.v2.model.AttributeEntityListing;
import com.mypurecloud.sdk.v2.model.AttributeQueryRequest;

public class PostAttributesQueryRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private AttributeQueryRequest body;
	public AttributeQueryRequest getBody() {
		return this.body;
	}

	public void setBody(AttributeQueryRequest body) {
		this.body = body;
	}

	public PostAttributesQueryRequest withBody(AttributeQueryRequest body) {
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

    public PostAttributesQueryRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<AttributeQueryRequest> withHttpInfo() {
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostAttributesQueryRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/attributes/query")
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

	public static Builder builder(AttributeQueryRequest body) {
	    return new Builder()
	            .withRequiredParams(body);
	}

	public static class Builder {
		private final PostAttributesQueryRequest request;

		private Builder() {
			request = new PostAttributesQueryRequest();
		}

		public Builder withBody(AttributeQueryRequest body) {
			request.setBody(body);
			return this;
		}

		public Builder withRequiredParams(AttributeQueryRequest body) {
			request.setBody(body);
			return this;
		}


		public PostAttributesQueryRequest build() {
			return request;
		}
	}
}
