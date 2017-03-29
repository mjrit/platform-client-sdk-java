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
import com.mypurecloud.sdk.v2.model.Greeting;
import com.mypurecloud.sdk.v2.model.GreetingMediaInfo;
import com.mypurecloud.sdk.v2.model.DomainEntityListing;
import com.mypurecloud.sdk.v2.model.DefaultGreetingList;
import com.mypurecloud.sdk.v2.model.GreetingListing;

public class PutGreetingRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String greetingId;
	public String getGreetingId() {
		return this.greetingId;
	}

	public void setGreetingId(String greetingId) {
		this.greetingId = greetingId;
	}

	public PutGreetingRequest withGreetingId(String greetingId) {
	    this.setGreetingId(greetingId);
	    return this;
	}

	private Greeting body;
	public Greeting getBody() {
		return this.body;
	}

	public void setBody(Greeting body) {
		this.body = body;
	}

	public PutGreetingRequest withBody(Greeting body) {
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

    public PutGreetingRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Greeting> withHttpInfo() throws ApiException {
        
        // verify the required parameter 'greetingId' is set
        if (this.greetingId == null) {
            throw new ApiException(400, "Missing the required parameter 'greetingId' when building request for PutGreetingRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when building request for PutGreetingRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/greetings/{greetingId}")
                .withPathParameter("greetingId", greetingId)
        
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

	public static Builder builder(String greetingId, Greeting body) {
	    return new Builder()
	            .withRequiredParams(greetingId, body);
	}

	public static class Builder {
		private final PutGreetingRequest request;

		private Builder() {
			request = new PutGreetingRequest();
		}

		public Builder withGreetingId(String greetingId) {
			request.setGreetingId(greetingId);
			return this;
		}
		public Builder withBody(Greeting body) {
			request.setBody(body);
			return this;
		}

		public Builder withRequiredParams(String greetingId, Greeting body) {
			request.setGreetingId(greetingId);
			request.setBody(body);
			return this;
		}


		public PutGreetingRequest build() {
			return request;
		}
	}
}