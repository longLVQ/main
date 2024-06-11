package com.evri.swagger.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * SwaggerDtoTest
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-11T07:00:33.107080774Z[GMT]")


public class SwaggerDtoTest   {
  @JsonProperty("courierId")
  private String courierId = null;

  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("totalPay")
  private Double totalPay = null;

  @JsonProperty("lastUpdatedAt")
  private LocalDateTime lastUpdatedAt = null;

  public SwaggerDtoTest courierId(String courierId) {
    this.courierId = courierId;
    return this;
  }

  /**
   * Get courierId
   * @return courierId
   **/
  @Schema(description = "")
  
    public String getCourierId() {
    return courierId;
  }

  public void setCourierId(String courierId) {
    this.courierId = courierId;
  }

  public SwaggerDtoTest date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   **/
  @Schema(description = "")
  
    @Valid
    public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public SwaggerDtoTest totalPay(Double totalPay) {
    this.totalPay = totalPay;
    return this;
  }

  /**
   * Get totalPay
   * @return totalPay
   **/
  @Schema(description = "")
  
    public Double getTotalPay() {
    return totalPay;
  }

  public void setTotalPay(Double totalPay) {
    this.totalPay = totalPay;
  }

  public SwaggerDtoTest lastUpdatedAt(LocalDateTime lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }

  /**
   * Get lastUpdatedAt
   * @return lastUpdatedAt
   **/
  @Schema(description = "")
  
    @Valid
    public LocalDateTime getLastUpdatedAt() {
    return lastUpdatedAt;
  }

  public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwaggerDtoTest swaggerDtoTest = (SwaggerDtoTest) o;
    return Objects.equals(this.courierId, swaggerDtoTest.courierId) &&
        Objects.equals(this.date, swaggerDtoTest.date) &&
        Objects.equals(this.totalPay, swaggerDtoTest.totalPay) &&
        Objects.equals(this.lastUpdatedAt, swaggerDtoTest.lastUpdatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courierId, date, totalPay, lastUpdatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwaggerDtoTest {\n");
    
    sb.append("    courierId: ").append(toIndentedString(courierId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    totalPay: ").append(toIndentedString(totalPay)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
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
