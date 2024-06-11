package com.evri.swagger.dtos;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * SwaggerRequest
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-11T14:29:54.527376525Z[GMT]")


public class SwaggerRequest   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("courierType")
  private String courierType = null;

  @JsonProperty("applicantId")
  private String applicantId = null;

  public SwaggerRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the courier
   * @return id
   **/
  @Schema(description = "Unique identifier of the courier")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SwaggerRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the courier
   * @return name
   **/
  @Schema(description = "Name of the courier")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SwaggerRequest courierType(String courierType) {
    this.courierType = courierType;
    return this;
  }

  /**
   * Type of the courier
   * @return courierType
   **/
  @Schema(description = "Type of the courier")
  
    public String getCourierType() {
    return courierType;
  }

  public void setCourierType(String courierType) {
    this.courierType = courierType;
  }

  public SwaggerRequest applicantId(String applicantId) {
    this.applicantId = applicantId;
    return this;
  }

  /**
   * Identifier of the applicant
   * @return applicantId
   **/
  @Schema(description = "Identifier of the applicant")
  
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
    return Objects.equals(this.id, swaggerRequest.id) &&
        Objects.equals(this.name, swaggerRequest.name) &&
        Objects.equals(this.courierType, swaggerRequest.courierType) &&
        Objects.equals(this.applicantId, swaggerRequest.applicantId);
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
