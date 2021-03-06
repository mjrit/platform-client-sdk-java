package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CampaignRuleActionEntities
 */

public class CampaignRuleActionEntities  implements Serializable {
  
  private List<UriReference> campaigns = new ArrayList<UriReference>();
  private List<UriReference> sequences = new ArrayList<UriReference>();
  private Boolean useTriggeringEntity = null;

  
  /**
   * The list of campaigns for a CampaignRule to monitor. Required if the CampaignRule has any conditions that run on a campaign.
   **/
  public CampaignRuleActionEntities campaigns(List<UriReference> campaigns) {
    this.campaigns = campaigns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of campaigns for a CampaignRule to monitor. Required if the CampaignRule has any conditions that run on a campaign.")
  @JsonProperty("campaigns")
  public List<UriReference> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<UriReference> campaigns) {
    this.campaigns = campaigns;
  }

  
  /**
   * The list of sequences for a CampaignRule to monitor. Required if the CampaignRule has any conditions that run on a sequence.
   **/
  public CampaignRuleActionEntities sequences(List<UriReference> sequences) {
    this.sequences = sequences;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of sequences for a CampaignRule to monitor. Required if the CampaignRule has any conditions that run on a sequence.")
  @JsonProperty("sequences")
  public List<UriReference> getSequences() {
    return sequences;
  }
  public void setSequences(List<UriReference> sequences) {
    this.sequences = sequences;
  }

  
  /**
   * If true, the CampaignRuleAction will apply to the same entity that triggered the CampaignRuleCondition.
   **/
  public CampaignRuleActionEntities useTriggeringEntity(Boolean useTriggeringEntity) {
    this.useTriggeringEntity = useTriggeringEntity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, the CampaignRuleAction will apply to the same entity that triggered the CampaignRuleCondition.")
  @JsonProperty("useTriggeringEntity")
  public Boolean getUseTriggeringEntity() {
    return useTriggeringEntity;
  }
  public void setUseTriggeringEntity(Boolean useTriggeringEntity) {
    this.useTriggeringEntity = useTriggeringEntity;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRuleActionEntities campaignRuleActionEntities = (CampaignRuleActionEntities) o;
    return Objects.equals(this.campaigns, campaignRuleActionEntities.campaigns) &&
        Objects.equals(this.sequences, campaignRuleActionEntities.sequences) &&
        Objects.equals(this.useTriggeringEntity, campaignRuleActionEntities.useTriggeringEntity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaigns, sequences, useTriggeringEntity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleActionEntities {\n");
    
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    sequences: ").append(toIndentedString(sequences)).append("\n");
    sb.append("    useTriggeringEntity: ").append(toIndentedString(useTriggeringEntity)).append("\n");
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

