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
import com.mypurecloud.sdk.v2.model.HeartBeatAlert;
import com.mypurecloud.sdk.v2.model.HeartBeatAlertContainer;
import com.mypurecloud.sdk.v2.model.HeartBeatRule;
import com.mypurecloud.sdk.v2.model.HeartBeatRuleContainer;
import com.mypurecloud.sdk.v2.model.InteractionStatsAlert;
import com.mypurecloud.sdk.v2.model.InteractionStatsAlertContainer;
import com.mypurecloud.sdk.v2.model.UnreadMetric;
import com.mypurecloud.sdk.v2.model.InteractionStatsRule;
import com.mypurecloud.sdk.v2.model.InteractionStatsRuleContainer;
import com.mypurecloud.sdk.v2.model.RoutingStatusAlert;
import com.mypurecloud.sdk.v2.model.RoutingStatusAlertContainer;
import com.mypurecloud.sdk.v2.model.RoutingStatusRule;
import com.mypurecloud.sdk.v2.model.RoutingStatusRuleContainer;
import com.mypurecloud.sdk.v2.model.UserPresenceAlert;
import com.mypurecloud.sdk.v2.model.UserPresenceAlertContainer;
import com.mypurecloud.sdk.v2.model.UserPresenceRule;
import com.mypurecloud.sdk.v2.model.UserPresenceRuleContainer;
import com.mypurecloud.sdk.v2.model.UnreadStatus;

public class PostAlertingHeartbeatRulesRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private HeartBeatRule body;
	public HeartBeatRule getBody() {
		return this.body;
	}

	public void setBody(HeartBeatRule body) {
		this.body = body;
	}

	public PostAlertingHeartbeatRulesRequest withBody(HeartBeatRule body) {
	    this.setBody(body);
	    return this;
	}

	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public PostAlertingHeartbeatRulesRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
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

    public PostAlertingHeartbeatRulesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<HeartBeatRule> withHttpInfo() throws ApiException {
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when building request for PostAlertingHeartbeatRulesRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/alerting/heartbeat/rules")
                .withQueryParameters("expand", "multi", expand)
        
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

	public static Builder builder(HeartBeatRule body) {
	    return new Builder()
	            .withRequiredParams(body);
	}

	public static class Builder {
		private final PostAlertingHeartbeatRulesRequest request;

		private Builder() {
			request = new PostAlertingHeartbeatRulesRequest();
		}

		public Builder withBody(HeartBeatRule body) {
			request.setBody(body);
			return this;
		}
		public Builder withExpand(List<String> expand) {
			request.setExpand(expand);
			return this;
		}

		public Builder withRequiredParams(HeartBeatRule body) {
			request.setBody(body);
			return this;
		}


		public PostAlertingHeartbeatRulesRequest build() {
			return request;
		}
	}
}