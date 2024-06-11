package dto;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SwaggerRequest   {

  private @Valid String id = null;

  private @Valid String name = null;

  private @Valid String courierType = null;

  private @Valid String applicantId = null;

  /**
   * Unique identifier of the courier
   **/
  public SwaggerRequest id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of the courier")
  @JsonProperty("id")

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Name of the courier
   **/
  public SwaggerRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the courier")
  @JsonProperty("name")

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Type of the courier
   **/
  public SwaggerRequest courierType(String courierType) {
    this.courierType = courierType;
    return this;
  }

  
  @ApiModelProperty(value = "Type of the courier")
  @JsonProperty("courierType")

  public String getCourierType() {
    return courierType;
  }
  public void setCourierType(String courierType) {
    this.courierType = courierType;
  }

  /**
   * Identifier of the applicant
   **/
  public SwaggerRequest applicantId(String applicantId) {
    this.applicantId = applicantId;
    return this;
  }

  
  @ApiModelProperty(value = "Identifier of the applicant")
  @JsonProperty("applicantId")

  public String getApplicantId() {
    return applicantId;
  }
  public void setApplicantId(String applicantId) {
    this.applicantId = applicantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwaggerRequest swaggerRequest = (SwaggerRequest) o;
    return Objects.equals(id, swaggerRequest.id) &&
        Objects.equals(name, swaggerRequest.name) &&
        Objects.equals(courierType, swaggerRequest.courierType) &&
        Objects.equals(applicantId, swaggerRequest.applicantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, courierType, applicantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwaggerRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    courierType: ").append(toIndentedString(courierType)).append("\n");
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
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
