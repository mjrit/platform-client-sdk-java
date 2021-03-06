package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QuestionScore
 */

public class QuestionScore  implements Serializable {
  
  private String questionId = null;
  private String answerId = null;
  private Integer score = null;
  private Boolean markedNA = null;
  private Boolean failedKillQuestion = null;
  private String comments = null;

  
  /**
   **/
  public QuestionScore questionId(String questionId) {
    this.questionId = questionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("questionId")
  public String getQuestionId() {
    return questionId;
  }
  public void setQuestionId(String questionId) {
    this.questionId = questionId;
  }

  
  /**
   **/
  public QuestionScore answerId(String answerId) {
    this.answerId = answerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("answerId")
  public String getAnswerId() {
    return answerId;
  }
  public void setAnswerId(String answerId) {
    this.answerId = answerId;
  }

  
  /**
   **/
  public QuestionScore score(Integer score) {
    this.score = score;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("score")
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
    this.score = score;
  }

  
  /**
   **/
  public QuestionScore markedNA(Boolean markedNA) {
    this.markedNA = markedNA;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("markedNA")
  public Boolean getMarkedNA() {
    return markedNA;
  }
  public void setMarkedNA(Boolean markedNA) {
    this.markedNA = markedNA;
  }

  
  /**
   **/
  public QuestionScore failedKillQuestion(Boolean failedKillQuestion) {
    this.failedKillQuestion = failedKillQuestion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("failedKillQuestion")
  public Boolean getFailedKillQuestion() {
    return failedKillQuestion;
  }
  public void setFailedKillQuestion(Boolean failedKillQuestion) {
    this.failedKillQuestion = failedKillQuestion;
  }

  
  /**
   **/
  public QuestionScore comments(String comments) {
    this.comments = comments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("comments")
  public String getComments() {
    return comments;
  }
  public void setComments(String comments) {
    this.comments = comments;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionScore questionScore = (QuestionScore) o;
    return Objects.equals(this.questionId, questionScore.questionId) &&
        Objects.equals(this.answerId, questionScore.answerId) &&
        Objects.equals(this.score, questionScore.score) &&
        Objects.equals(this.markedNA, questionScore.markedNA) &&
        Objects.equals(this.failedKillQuestion, questionScore.failedKillQuestion) &&
        Objects.equals(this.comments, questionScore.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, answerId, score, markedNA, failedKillQuestion, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionScore {\n");
    
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    answerId: ").append(toIndentedString(answerId)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    markedNA: ").append(toIndentedString(markedNA)).append("\n");
    sb.append("    failedKillQuestion: ").append(toIndentedString(failedKillQuestion)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

