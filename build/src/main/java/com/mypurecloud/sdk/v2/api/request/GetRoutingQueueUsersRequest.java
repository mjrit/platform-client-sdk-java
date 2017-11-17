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

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.InboundDomain;
import com.mypurecloud.sdk.v2.model.InboundRoute;
import com.mypurecloud.sdk.v2.model.InboundRouteEntityListing;
import com.mypurecloud.sdk.v2.model.InboundDomainEntityListing;
import com.mypurecloud.sdk.v2.model.EmailSetup;
import com.mypurecloud.sdk.v2.model.LanguageEntityListing;
import com.mypurecloud.sdk.v2.model.Queue;
import com.mypurecloud.sdk.v2.model.EstimatedWaitTimePredictions;
import com.mypurecloud.sdk.v2.model.QueueMemberEntityListing;
import com.mypurecloud.sdk.v2.model.WrapupCodeEntityListing;
import com.mypurecloud.sdk.v2.model.QueueEntityListing;
import com.mypurecloud.sdk.v2.model.RoutingSkill;
import com.mypurecloud.sdk.v2.model.SkillEntityListing;
import com.mypurecloud.sdk.v2.model.Utilization;
import com.mypurecloud.sdk.v2.model.WrapupCode;
import com.mypurecloud.sdk.v2.model.UserSkillEntityListing;
import com.mypurecloud.sdk.v2.model.QueueMember;
import com.mypurecloud.sdk.v2.model.QualifierMappingObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.ObservationQuery;
import com.mypurecloud.sdk.v2.model.Language;
import com.mypurecloud.sdk.v2.model.CreateQueueRequest;
import com.mypurecloud.sdk.v2.model.UserRoutingSkillPost;
import com.mypurecloud.sdk.v2.model.UserRoutingSkill;

public class GetRoutingQueueUsersRequest {
    
	private String queueId;
	public String getQueueId() {
		return this.queueId;
	}

	public void setQueueId(String queueId) {
		this.queueId = queueId;
	}

	public GetRoutingQueueUsersRequest withQueueId(String queueId) {
	    this.setQueueId(queueId);
	    return this;
	} 
	
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetRoutingQueueUsersRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 
	
	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetRoutingQueueUsersRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 
	
	private String sortBy;
	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public GetRoutingQueueUsersRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 
	
	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetRoutingQueueUsersRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		ROUTINGSTATUS("routingStatus"), 
		PRESENCE("presence"), 
		CONVERSATIONSUMMARY("conversationSummary"), 
		OUTOFOFFICE("outOfOffice"), 
		GEOLOCATION("geolocation"), 
		STATION("station"), 
		AUTHORIZATION("authorization"), 
		PROFILESKILLS("profileSkills"), 
		LOCATIONS("locations"), 
		GROUPS("groups"), 
		DATE("date"), 
		GEOLOCATIONSETTINGS("geolocationsettings"), 
		ORGANIZATION("organization"), 
		PRESENCEDEFINITIONS("presencedefinitions"), 
		LOCATIONDEFINITIONS("locationdefinitions"), 
		ORGAUTHORIZATION("orgauthorization"), 
		FAVORITES("favorites"), 
		SUPERIORS("superiors"), 
		DIRECTREPORTS("directreports"), 
		ADJACENTS("adjacents"), 
		ROUTINGSKILLS("routingskills"), 
		ROUTINGLANGUAGES("routinglanguages"), 
		FIELDCONFIGS("fieldconfigs"), 
		TOKEN("token"), 
		TRUSTORS("trustors");

		private String value;

		expandValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static expandValues fromString(String key) {
			if (key == null) return null;

			for (expandValues value : expandValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return expandValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private Boolean joined;
	public Boolean getJoined() {
		return this.joined;
	}

	public void setJoined(Boolean joined) {
		this.joined = joined;
	}

	public GetRoutingQueueUsersRequest withJoined(Boolean joined) {
	    this.setJoined(joined);
	    return this;
	} 
	
	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetRoutingQueueUsersRequest withName(String name) {
	    this.setName(name);
	    return this;
	} 
	
	private List<String> profileSkills;
	public List<String> getProfileSkills() {
		return this.profileSkills;
	}

	public void setProfileSkills(List<String> profileSkills) {
		this.profileSkills = profileSkills;
	}

	public GetRoutingQueueUsersRequest withProfileSkills(List<String> profileSkills) {
	    this.setProfileSkills(profileSkills);
	    return this;
	} 
	
	private List<String> skills;
	public List<String> getSkills() {
		return this.skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public GetRoutingQueueUsersRequest withSkills(List<String> skills) {
	    this.setSkills(skills);
	    return this;
	} 
	
	private List<String> languages;
	public List<String> getLanguages() {
		return this.languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public GetRoutingQueueUsersRequest withLanguages(List<String> languages) {
	    this.setLanguages(languages);
	    return this;
	} 
	
	private List<String> routingStatus;
	public List<String> getRoutingStatus() {
		return this.routingStatus;
	}

	public void setRoutingStatus(List<String> routingStatus) {
		this.routingStatus = routingStatus;
	}

	public GetRoutingQueueUsersRequest withRoutingStatus(List<String> routingStatus) {
	    this.setRoutingStatus(routingStatus);
	    return this;
	} 
	
	private List<String> presence;
	public List<String> getPresence() {
		return this.presence;
	}

	public void setPresence(List<String> presence) {
		this.presence = presence;
	}

	public GetRoutingQueueUsersRequest withPresence(List<String> presence) {
	    this.setPresence(presence);
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

    public GetRoutingQueueUsersRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'queueId' is set
        if (this.queueId == null) {
            throw new IllegalStateException("Missing the required parameter 'queueId' when building request for GetRoutingQueueUsersRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/routing/queues/{queueId}/users")
                .withPathParameter("queueId", queueId)
        
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("sortBy", "", sortBy)
        
                .withQueryParameters("expand", "multi", expand)
        
                .withQueryParameters("joined", "", joined)
        
                .withQueryParameters("name", "", name)
        
                .withQueryParameters("profileSkills", "multi", profileSkills)
        
                .withQueryParameters("skills", "multi", skills)
        
                .withQueryParameters("languages", "multi", languages)
        
                .withQueryParameters("routingStatus", "multi", routingStatus)
        
                .withQueryParameters("presence", "multi", presence)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String queueId) {
	    return new Builder()
	            .withRequiredParams(queueId);
	}
	

	public static class Builder {
		private final GetRoutingQueueUsersRequest request;

		private Builder() {
			request = new GetRoutingQueueUsersRequest();
		}

		
		public Builder withQueueId(String queueId) {
			request.setQueueId(queueId);
			return this;
		}
		
		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}
		
		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}
		
		public Builder withSortBy(String sortBy) {
			request.setSortBy(sortBy);
			return this;
		}
		
		public Builder withExpand(List<String> expand) {
			request.setExpand(expand);
			return this;
		}

		public Builder withExpandEnumValues(List<expandValues> expand) {
		    List<String> stringList = new ArrayList<>();
	      for (expandValues e : expand) {
	        stringList.add(e.toString());
	      }
	      request.setExpand(stringList);
		    return this;
		}
		
		public Builder withJoined(Boolean joined) {
			request.setJoined(joined);
			return this;
		}
		
		public Builder withName(String name) {
			request.setName(name);
			return this;
		}
		
		public Builder withProfileSkills(List<String> profileSkills) {
			request.setProfileSkills(profileSkills);
			return this;
		}
		
		public Builder withSkills(List<String> skills) {
			request.setSkills(skills);
			return this;
		}
		
		public Builder withLanguages(List<String> languages) {
			request.setLanguages(languages);
			return this;
		}
		
		public Builder withRoutingStatus(List<String> routingStatus) {
			request.setRoutingStatus(routingStatus);
			return this;
		}
		
		public Builder withPresence(List<String> presence) {
			request.setPresence(presence);
			return this;
		}
		

		
		public Builder withRequiredParams(String queueId) {
			request.setQueueId(queueId);
			
			return this;
		}
		

		public GetRoutingQueueUsersRequest build() {
            
            // verify the required parameter 'queueId' is set
            if (request.queueId == null) {
                throw new IllegalStateException("Missing the required parameter 'queueId' when building request for GetRoutingQueueUsersRequest.");
            }
            
			return request;
		}
	}
}
