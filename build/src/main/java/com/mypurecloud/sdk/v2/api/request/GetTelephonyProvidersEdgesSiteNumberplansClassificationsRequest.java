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
import com.mypurecloud.sdk.v2.model.SchemaCategoryEntityListing;
import com.mypurecloud.sdk.v2.model.SchemaReferenceEntityListing;
import com.mypurecloud.sdk.v2.model.Organization;
import com.mypurecloud.sdk.v2.model.Edge;
import com.mypurecloud.sdk.v2.model.EdgeLine;
import com.mypurecloud.sdk.v2.model.EdgeLineEntityListing;
import com.mypurecloud.sdk.v2.model.DomainLogicalInterface;
import com.mypurecloud.sdk.v2.model.LogicalInterfaceEntityListing;
import com.mypurecloud.sdk.v2.model.EdgeLogsJob;
import com.mypurecloud.sdk.v2.model.DomainPhysicalInterface;
import com.mypurecloud.sdk.v2.model.PhysicalInterfaceEntityListing;
import com.mypurecloud.sdk.v2.model.VmPairingInfo;
import com.mypurecloud.sdk.v2.model.DomainEdgeSoftwareUpdateDto;
import com.mypurecloud.sdk.v2.model.DomainEdgeSoftwareVersionDtoEntityListing;
import com.mypurecloud.sdk.v2.model.EdgeEntityListing;
import com.mypurecloud.sdk.v2.model.AvailableLanguageList;
import com.mypurecloud.sdk.v2.model.CertificateAuthorityEntityListing;
import com.mypurecloud.sdk.v2.model.DomainCertificateAuthority;
import com.mypurecloud.sdk.v2.model.DID;
import com.mypurecloud.sdk.v2.model.DIDPool;
import com.mypurecloud.sdk.v2.model.DIDPoolEntityListing;
import com.mypurecloud.sdk.v2.model.DIDEntityListing;
import com.mypurecloud.sdk.v2.model.EdgeGroup;
import com.mypurecloud.sdk.v2.model.EdgeTrunkBase;
import com.mypurecloud.sdk.v2.model.EdgeGroupEntityListing;
import com.mypurecloud.sdk.v2.model.EdgeVersionReport;
import com.mypurecloud.sdk.v2.model.Endpoint;
import com.mypurecloud.sdk.v2.model.EndpointEntityListing;
import com.mypurecloud.sdk.v2.model.Extension;
import com.mypurecloud.sdk.v2.model.ExtensionPool;
import com.mypurecloud.sdk.v2.model.ExtensionPoolEntityListing;
import com.mypurecloud.sdk.v2.model.ExtensionEntityListing;
import com.mypurecloud.sdk.v2.model.Line;
import com.mypurecloud.sdk.v2.model.LineBase;
import com.mypurecloud.sdk.v2.model.LineBaseEntityListing;
import com.mypurecloud.sdk.v2.model.LineEntityListing;
import com.mypurecloud.sdk.v2.model.OutboundRoute;
import com.mypurecloud.sdk.v2.model.OutboundRouteEntityListing;
import com.mypurecloud.sdk.v2.model.Phone;
import com.mypurecloud.sdk.v2.model.PhoneBase;
import com.mypurecloud.sdk.v2.model.PhoneBaseEntityListing;
import com.mypurecloud.sdk.v2.model.PhoneMetaBaseEntityListing;
import com.mypurecloud.sdk.v2.model.PhoneEntityListing;
import com.mypurecloud.sdk.v2.model.Site;
import com.mypurecloud.sdk.v2.model.NumberPlan;
import com.mypurecloud.sdk.v2.model.OutboundRouteBase;
import com.mypurecloud.sdk.v2.model.OutboundRouteBaseEntityListing;
import com.mypurecloud.sdk.v2.model.SiteEntityListing;
import com.mypurecloud.sdk.v2.model.TimeZoneEntityListing;
import com.mypurecloud.sdk.v2.model.Trunk;
import com.mypurecloud.sdk.v2.model.TrunkBase;
import com.mypurecloud.sdk.v2.model.TrunkBaseEntityListing;
import com.mypurecloud.sdk.v2.model.TrunkMetabaseEntityListing;
import com.mypurecloud.sdk.v2.model.TrunkEntityListing;
import com.mypurecloud.sdk.v2.model.TrunkRecordingEnabledCount;
import com.mypurecloud.sdk.v2.model.EdgeLogsJobUploadRequest;
import com.mypurecloud.sdk.v2.model.EdgeLogsJobRequest;
import com.mypurecloud.sdk.v2.model.EdgeLogsJobResponse;
import com.mypurecloud.sdk.v2.model.EdgeRebootParameters;
import com.mypurecloud.sdk.v2.model.EdgeServiceStateRequest;
import com.mypurecloud.sdk.v2.model.ValidateAddressResponse;
import com.mypurecloud.sdk.v2.model.ValidateAddressRequest;
import com.mypurecloud.sdk.v2.model.PhonesReboot;

public class GetTelephonyProvidersEdgesSiteNumberplansClassificationsRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String siteId;
	public String getSiteId() {
		return this.siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public GetTelephonyProvidersEdgesSiteNumberplansClassificationsRequest withSiteId(String siteId) {
	    this.setSiteId(siteId);
	    return this;
	}

	private String classification;
	public String getClassification() {
		return this.classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public GetTelephonyProvidersEdgesSiteNumberplansClassificationsRequest withClassification(String classification) {
	    this.setClassification(classification);
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

    public GetTelephonyProvidersEdgesSiteNumberplansClassificationsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'siteId' is set
        if (this.siteId == null) {
            throw new IllegalStateException("Missing the required parameter 'siteId' when building request for GetTelephonyProvidersEdgesSiteNumberplansClassificationsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/telephony/providers/edges/sites/{siteId}/numberplans/classifications")
                .withPathParameter("siteId", siteId)
        
                .withQueryParameters("classification", "", classification)
                        .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String siteId) {
	    return new Builder()
	            .withRequiredParams(siteId);
	}

	public static class Builder {
		private final GetTelephonyProvidersEdgesSiteNumberplansClassificationsRequest request;

		private Builder() {
			request = new GetTelephonyProvidersEdgesSiteNumberplansClassificationsRequest();
		}

		public Builder withSiteId(String siteId) {
			request.setSiteId(siteId);
			return this;
		}
		public Builder withClassification(String classification) {
			request.setClassification(classification);
			return this;
		}

		public Builder withRequiredParams(String siteId) {
			request.setSiteId(siteId);
			return this;
		}


		public GetTelephonyProvidersEdgesSiteNumberplansClassificationsRequest build() {
			return request;
		}
	}
}
