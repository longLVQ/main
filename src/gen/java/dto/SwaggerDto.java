package dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SwaggerDto   {

  private @Valid String courierId = null;

  private @Valid LocalDate date = null;

  private @Valid Double totalPay = null;

  private @Valid LocalDateTime lastUpdatedAt = null;

  /**
   **/
  public SwaggerDto courierId(String courierId) {
    this.courierId = courierId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("courierId")

  public String getCourierId() {
    return courierId;
  }
  public void setCourierId(String courierId) {
    this.courierId = courierId;
  }

  /**
   **/
  public SwaggerDto date(LocalDate date) {
    this.date = date;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("date")

  public LocalDate getDate() {
    return date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }

  /**
   **/
  public SwaggerDto totalPay(Double totalPay) {
    this.totalPay = totalPay;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("totalPay")

  public Double getTotalPay() {
    return totalPay;
  }
  public void setTotalPay(Double totalPay) {
    this.totalPay = totalPay;
  }

  /**
   **/
  public SwaggerDto lastUpdatedAt(LocalDateTime lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("lastUpdatedAt")

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
    SwaggerDto swaggerDto = (SwaggerDto) o;
    return Objects.equals(courierId, swaggerDto.courierId) &&
        Objects.equals(date, swaggerDto.date) &&
        Objects.equals(totalPay, swaggerDto.totalPay) &&
        Objects.equals(lastUpdatedAt, swaggerDto.lastUpdatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courierId, date, totalPay, lastUpdatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwaggerDto {\n");
    
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
