package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.GroupContact;
import com.mypurecloud.sdk.v2.model.UserImage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * GroupCreate
 */

public class GroupCreate  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Date dateModified = null;
  private Long memberCount = null;

  /**
   * Active, inactive, or deleted state.
   */
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("active"),
    INACTIVE("inactive"),
    DELETED("deleted");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private Integer version = null;

  /**
   * Type of group.
   */
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OFFICIAL("official"),
    SOCIAL("social");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private List<UserImage> images = new ArrayList<UserImage>();
  private List<GroupContact> addresses = new ArrayList<GroupContact>();
  private Boolean rulesVisible = null;

  /**
   * Who can view this group
   */
  public enum VisibilityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PUBLIC("public"),
    OWNERS("owners"),
    MEMBERS("members");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static VisibilityEnum fromString(String key) {
      if (key == null) return null;

      for (VisibilityEnum value : VisibilityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return VisibilityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private VisibilityEnum visibility = null;
  private List<String> ownerIds = new ArrayList<String>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The group name.
   **/
  public GroupCreate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The group name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public GroupCreate description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  @ApiModelProperty(example = "null", value = "Last modified date/time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }

  
  @ApiModelProperty(example = "null", value = "Number of members.")
  @JsonProperty("memberCount")
  public Long getMemberCount() {
    return memberCount;
  }

  
  @ApiModelProperty(example = "null", value = "Active, inactive, or deleted state.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  
  @ApiModelProperty(example = "null", value = "Current version for this resource.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  
  /**
   * Type of group.
   **/
  public GroupCreate type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of group.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  public GroupCreate images(List<UserImage> images) {
    this.images = images;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("images")
  public List<UserImage> getImages() {
    return images;
  }
  public void setImages(List<UserImage> images) {
    this.images = images;
  }

  
  /**
   **/
  public GroupCreate addresses(List<GroupContact> addresses) {
    this.addresses = addresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addresses")
  public List<GroupContact> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<GroupContact> addresses) {
    this.addresses = addresses;
  }

  
  /**
   * Are membership rules visible to the person requesting to view the group
   **/
  public GroupCreate rulesVisible(Boolean rulesVisible) {
    this.rulesVisible = rulesVisible;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Are membership rules visible to the person requesting to view the group")
  @JsonProperty("rulesVisible")
  public Boolean getRulesVisible() {
    return rulesVisible;
  }
  public void setRulesVisible(Boolean rulesVisible) {
    this.rulesVisible = rulesVisible;
  }

  
  /**
   * Who can view this group
   **/
  public GroupCreate visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Who can view this group")
  @JsonProperty("visibility")
  public VisibilityEnum getVisibility() {
    return visibility;
  }
  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  
  /**
   * Owners of the group
   **/
  public GroupCreate ownerIds(List<String> ownerIds) {
    this.ownerIds = ownerIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Owners of the group")
  @JsonProperty("ownerIds")
  public List<String> getOwnerIds() {
    return ownerIds;
  }
  public void setOwnerIds(List<String> ownerIds) {
    this.ownerIds = ownerIds;
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
    GroupCreate groupCreate = (GroupCreate) o;
    return Objects.equals(this.id, groupCreate.id) &&
        Objects.equals(this.name, groupCreate.name) &&
        Objects.equals(this.description, groupCreate.description) &&
        Objects.equals(this.dateModified, groupCreate.dateModified) &&
        Objects.equals(this.memberCount, groupCreate.memberCount) &&
        Objects.equals(this.state, groupCreate.state) &&
        Objects.equals(this.version, groupCreate.version) &&
        Objects.equals(this.type, groupCreate.type) &&
        Objects.equals(this.images, groupCreate.images) &&
        Objects.equals(this.addresses, groupCreate.addresses) &&
        Objects.equals(this.rulesVisible, groupCreate.rulesVisible) &&
        Objects.equals(this.visibility, groupCreate.visibility) &&
        Objects.equals(this.ownerIds, groupCreate.ownerIds) &&
        Objects.equals(this.selfUri, groupCreate.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, dateModified, memberCount, state, version, type, images, addresses, rulesVisible, visibility, ownerIds, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupCreate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    rulesVisible: ").append(toIndentedString(rulesVisible)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    ownerIds: ").append(toIndentedString(ownerIds)).append("\n");
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

