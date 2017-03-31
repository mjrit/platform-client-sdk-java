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
import com.mypurecloud.sdk.v2.model.JsonNodeSearchResponse;
import com.mypurecloud.sdk.v2.model.SearchRequest;
import com.mypurecloud.sdk.v2.model.SuggestSearchRequest;

public class GetSearchSuggestRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String q64;
	public String getQ64() {
		return this.q64;
	}

	public void setQ64(String q64) {
		this.q64 = q64;
	}

	public GetSearchSuggestRequest withQ64(String q64) {
	    this.setQ64(q64);
	    return this;
	}

	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetSearchSuggestRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	}

	private Boolean profile;
	public Boolean getProfile() {
		return this.profile;
	}

	public void setProfile(Boolean profile) {
		this.profile = profile;
	}

	public GetSearchSuggestRequest withProfile(Boolean profile) {
	    this.setProfile(profile);
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

    public GetSearchSuggestRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'q64' is set
        if (this.q64 == null) {
            throw new IllegalStateException("Missing the required parameter 'q64' when building request for GetSearchSuggestRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/search/suggest")
                .withQueryParameters("q64", "", q64)
        
                .withQueryParameters("expand", "multi", expand)
        
                .withQueryParameters("profile", "", profile)
                        .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String q64) {
	    return new Builder()
	            .withRequiredParams(q64);
	}

	public static class Builder {
		private final GetSearchSuggestRequest request;

		private Builder() {
			request = new GetSearchSuggestRequest();
		}

		public Builder withQ64(String q64) {
			request.setQ64(q64);
			return this;
		}
		public Builder withExpand(List<String> expand) {
			request.setExpand(expand);
			return this;
		}
		public Builder withProfile(Boolean profile) {
			request.setProfile(profile);
			return this;
		}

		public Builder withRequiredParams(String q64) {
			request.setQ64(q64);
			return this;
		}


		public GetSearchSuggestRequest build() {
			return request;
		}
	}
}
