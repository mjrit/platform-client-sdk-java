package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.PagedResource;
import com.mypurecloud.sdk.v2.model.DomainEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DomainEntityListing
 */

public class DomainEntityListing  implements Serializable, PagedResource<DomainEntity> {
  
  private List<DomainEntity> entities = new ArrayList<DomainEntity>();
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private Long total = null;
  private String firstUri = null;
  private String selfUri = null;
  private String previousUri = null;
  private String nextUri = null;
  private String lastUri = null;
  private Integer pageCount = null;

  
  /**
   **/
  public DomainEntityListing entities(List<DomainEntity> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<DomainEntity> getEntities() {
    return entities;
  }
  public void setEntities(List<DomainEntity> entities) {
    this.entities = entities;
  }


  /**
   **/
  public DomainEntityListing pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  /**
   **/
  public DomainEntityListing pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  /**
   **/
  public DomainEntityListing total(Long total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }


  /**
   **/
  public DomainEntityListing firstUri(String firstUri) {
    this.firstUri = firstUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("firstUri")
  public String getFirstUri() {
    return firstUri;
  }
  public void setFirstUri(String firstUri) {
    this.firstUri = firstUri;
  }


  /**
   **/
  public DomainEntityListing selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }


  /**
   **/
  public DomainEntityListing previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previousUri")
  public String getPreviousUri() {
    return previousUri;
  }
  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }


  /**
   **/
  public DomainEntityListing nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nextUri")
  public String getNextUri() {
    return nextUri;
  }
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }


  /**
   **/
  public DomainEntityListing lastUri(String lastUri) {
    this.lastUri = lastUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastUri")
  public String getLastUri() {
    return lastUri;
  }
  public void setLastUri(String lastUri) {
    this.lastUri = lastUri;
  }


  /**
   **/
  public DomainEntityListing pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageCount")
  public Integer getPageCount() {
    return pageCount;
  }
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainEntityListing domainEntityListing = (DomainEntityListing) o;
    return Objects.equals(this.entities, domainEntityListing.entities) &&
        Objects.equals(this.pageSize, domainEntityListing.pageSize) &&
        Objects.equals(this.pageNumber, domainEntityListing.pageNumber) &&
        Objects.equals(this.total, domainEntityListing.total) &&
        Objects.equals(this.firstUri, domainEntityListing.firstUri) &&
        Objects.equals(this.selfUri, domainEntityListing.selfUri) &&
        Objects.equals(this.previousUri, domainEntityListing.previousUri) &&
        Objects.equals(this.nextUri, domainEntityListing.nextUri) &&
        Objects.equals(this.lastUri, domainEntityListing.lastUri) &&
        Objects.equals(this.pageCount, domainEntityListing.pageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, pageSize, pageNumber, total, firstUri, selfUri, previousUri, nextUri, lastUri, pageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainEntityListing {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    firstUri: ").append(toIndentedString(firstUri)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    lastUri: ").append(toIndentedString(lastUri)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
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
