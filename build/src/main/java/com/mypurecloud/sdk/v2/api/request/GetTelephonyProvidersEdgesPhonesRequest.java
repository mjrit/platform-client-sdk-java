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

public class GetTelephonyProvidersEdgesPhonesRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetTelephonyProvidersEdgesPhonesRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	}

	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetTelephonyProvidersEdgesPhonesRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	}

	private String sortBy;
	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public GetTelephonyProvidersEdgesPhonesRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	}

	private String sortOrder;
	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public GetTelephonyProvidersEdgesPhonesRequest withSortOrder(String sortOrder) {
	    this.setSortOrder(sortOrder);
	    return this;
	}

	private String siteId;
	public String getSiteId() {
		return this.siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public GetTelephonyProvidersEdgesPhonesRequest withSiteId(String siteId) {
	    this.setSiteId(siteId);
	    return this;
	}

	private String webRtcUserId;
	public String getWebRtcUserId() {
		return this.webRtcUserId;
	}

	public void setWebRtcUserId(String webRtcUserId) {
		this.webRtcUserId = webRtcUserId;
	}

	public GetTelephonyProvidersEdgesPhonesRequest withWebRtcUserId(String webRtcUserId) {
	    this.setWebRtcUserId(webRtcUserId);
	    return this;
	}

	private String phoneBaseSettingsId;
	public String getPhoneBaseSettingsId() {
		return this.phoneBaseSettingsId;
	}

	public void setPhoneBaseSettingsId(String phoneBaseSettingsId) {
		this.phoneBaseSettingsId = phoneBaseSettingsId;
	}

	public GetTelephonyProvidersEdgesPhonesRequest withPhoneBaseSettingsId(String phoneBaseSettingsId) {
	    this.setPhoneBaseSettingsId(phoneBaseSettingsId);
	    return this;
	}

	private String linesLoggedInUserId;
	public String getLinesLoggedInUserId() {
		return this.linesLoggedInUserId;
	}

	public void setLinesLoggedInUserId(String linesLoggedInUserId) {
		this.linesLoggedInUserId = linesLoggedInUserId;
	}

	public GetTelephonyProvidersEdgesPhonesRequest withLinesLoggedInUserId(String linesLoggedInUserId) {
	    this.setLinesLoggedInUserId(linesLoggedInUserId);
	    return this;
	}

	private String linesDefaultForUserId;
	public String getLinesDefaultForUserId() {
		return this.linesDefaultForUserId;
	}

	public void setLinesDefaultForUserId(String linesDefaultForUserId) {
		this.linesDefaultForUserId = linesDefaultForUserId;
	}

	public GetTelephonyProvidersEdgesPhonesRequest withLinesDefaultForUserId(String linesDefaultForUserId) {
	    this.setLinesDefaultForUserId(linesDefaultForUserId);
	    return this;
	}

	private String phoneHardwareId;
	public String getPhoneHardwareId() {
		return this.phoneHardwareId;
	}

	public void setPhoneHardwareId(String phoneHardwareId) {
		this.phoneHardwareId = phoneHardwareId;
	}

	public GetTelephonyProvidersEdgesPhonesRequest withPhoneHardwareId(String phoneHardwareId) {
	    this.setPhoneHardwareId(phoneHardwareId);
	    return this;
	}

	private String linesId;
	public String getLinesId() {
		return this.linesId;
	}

	public void setLinesId(String linesId) {
		this.linesId = linesId;
	}

	public GetTelephonyProvidersEdgesPhonesRequest withLinesId(String linesId) {
	    this.setLinesId(linesId);
	    return this;
	}

	private String linesName;
	public String getLinesName() {
		return this.linesName;
	}

	public void setLinesName(String linesName) {
		this.linesName = linesName;
	}

	public GetTelephonyProvidersEdgesPhonesRequest withLinesName(String linesName) {
	    this.setLinesName(linesName);
	    return this;
	}

	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetTelephonyProvidersEdgesPhonesRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	}

	private List<String> fields;
	public List<String> getFields() {
		return this.fields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public GetTelephonyProvidersEdgesPhonesRequest withFields(List<String> fields) {
	    this.setFields(fields);
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

    public GetTelephonyProvidersEdgesPhonesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() throws ApiException {
        

        return ApiRequestBuilder.create("GET", "/api/v2/telephony/providers/edges/phones")
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("sortBy", "", sortBy)
        
                .withQueryParameters("sortOrder", "", sortOrder)
        
                .withQueryParameters("site.id", "", siteId)
        
                .withQueryParameters("webRtcUser.id", "", webRtcUserId)
        
                .withQueryParameters("phoneBaseSettings.id", "", phoneBaseSettingsId)
        
                .withQueryParameters("lines.loggedInUser.id", "", linesLoggedInUserId)
        
                .withQueryParameters("lines.defaultForUser.id", "", linesDefaultForUserId)
        
                .withQueryParameters("phone_hardwareId", "", phoneHardwareId)
        
                .withQueryParameters("lines.id", "", linesId)
        
                .withQueryParameters("lines.name", "", linesName)
        
                .withQueryParameters("expand", "multi", expand)
        
                .withQueryParameters("fields", "multi", fields)
                        .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static class Builder {
		private final GetTelephonyProvidersEdgesPhonesRequest request;

		private Builder() {
			request = new GetTelephonyProvidersEdgesPhonesRequest();
		}

		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}
		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}
		public Builder withSortBy(String sortBy) {
			request.setSortBy(sortBy);
			return this;
		}
		public Builder withSortOrder(String sortOrder) {
			request.setSortOrder(sortOrder);
			return this;
		}
		public Builder withSiteId(String siteId) {
			request.setSiteId(siteId);
			return this;
		}
		public Builder withWebRtcUserId(String webRtcUserId) {
			request.setWebRtcUserId(webRtcUserId);
			return this;
		}
		public Builder withPhoneBaseSettingsId(String phoneBaseSettingsId) {
			request.setPhoneBaseSettingsId(phoneBaseSettingsId);
			return this;
		}
		public Builder withLinesLoggedInUserId(String linesLoggedInUserId) {
			request.setLinesLoggedInUserId(linesLoggedInUserId);
			return this;
		}
		public Builder withLinesDefaultForUserId(String linesDefaultForUserId) {
			request.setLinesDefaultForUserId(linesDefaultForUserId);
			return this;
		}
		public Builder withPhoneHardwareId(String phoneHardwareId) {
			request.setPhoneHardwareId(phoneHardwareId);
			return this;
		}
		public Builder withLinesId(String linesId) {
			request.setLinesId(linesId);
			return this;
		}
		public Builder withLinesName(String linesName) {
			request.setLinesName(linesName);
			return this;
		}
		public Builder withExpand(List<String> expand) {
			request.setExpand(expand);
			return this;
		}
		public Builder withFields(List<String> fields) {
			request.setFields(fields);
			return this;
		}



		public GetTelephonyProvidersEdgesPhonesRequest build() {
			return request;
		}
	}
}