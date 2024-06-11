package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.time.LocalDateTime;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2024-06-11T12:20:55.317086324Z[GMT]")

public class SwaggerDto   {
  @JsonProperty("courierId")
  private String courierId = null;
  @JsonProperty("date")
  private LocalDate date = null;
  @JsonProperty("totalPay")
  private Double totalPay = null;
  @JsonProperty("lastUpdatedAt")
  private LocalDateTime lastUpdatedAt = null;
  /**
   **/
  public SwaggerDto courierId(String courierId) {
    this.courierId = courierId;
    return this;
  }

  
  @Schema(description = "")
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

  
  @Schema(description = "")
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

  
  @Schema(description = "")
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

  
  @Schema(description = "")
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
