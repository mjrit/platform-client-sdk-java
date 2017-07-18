package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.OrgUser;
import com.mypurecloud.sdk.v2.model.Organization;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * TrustRequest
 */

public class TrustRequest  implements Serializable {
  
  private String id = null;
  private OrgUser createdBy = null;
  private Date dateCreated = null;
  private Organization trustee = null;
  private List<OrgUser> users = new ArrayList<OrgUser>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * User who created this request.
   **/
  public TrustRequest createdBy(OrgUser createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User who created this request.")
  @JsonProperty("createdBy")
  public OrgUser getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(OrgUser createdBy) {
    this.createdBy = createdBy;
  }

  
  @ApiModelProperty(example = "null", value = "Date request was created. There is a 48 hour expiration on all requests. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  /**
   * Trustee organization who generated this request.
   **/
  public TrustRequest trustee(Organization trustee) {
    this.trustee = trustee;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Trustee organization who generated this request.")
  @JsonProperty("trustee")
  public Organization getTrustee() {
    return trustee;
  }
  public void setTrustee(Organization trustee) {
    this.trustee = trustee;
  }

  
  /**
   * The list of trustee users that are requesting access.
   **/
  public TrustRequest users(List<OrgUser> users) {
    this.users = users;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of trustee users that are requesting access.")
  @JsonProperty("users")
  public List<OrgUser> getUsers() {
    return users;
  }
  public void setUsers(List<OrgUser> users) {
    this.users = users;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustRequest trustRequest = (TrustRequest) o;
    return Objects.equals(this.id, trustRequest.id) &&
        Objects.equals(this.createdBy, trustRequest.createdBy) &&
        Objects.equals(this.dateCreated, trustRequest.dateCreated) &&
        Objects.equals(this.trustee, trustRequest.trustee) &&
        Objects.equals(this.users, trustRequest.users) &&
        Objects.equals(this.selfUri, trustRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdBy, dateCreated, trustee, users, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    trustee: ").append(toIndentedString(trustee)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

