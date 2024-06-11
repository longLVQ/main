/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.56).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.evri.swagger.apis;

import com.evri.swagger.dto.SwaggerDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-11T09:30:21.126468746Z[GMT]")
@Validated
public interface SwaggerHubApi {

    Logger log = LoggerFactory.getLogger(SwaggerHubApi.class);

    default Optional<ObjectMapper> getObjectMapper(){
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest(){
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @Operation(summary = "Get api", description = "Get api", tags={ "swagger-hub" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Get api", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SwaggerDto.class))) })
    @RequestMapping(value = "/swagger-hub",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<SwaggerDto> swaggerHubGet() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\n  \"date\" : \"2000-01-23\",\n  \"totalPay\" : 0.8008281904610115,\n  \"lastUpdatedAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"courierId\" : \"courierId\"\n}", SwaggerDto.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default SwaggerHubApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @Operation(summary = "Post api", description = "Post api", tags={ "swagger-hub" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Post api.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SwaggerDto.class))) })
    @RequestMapping(value = "/swagger-hub",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<SwaggerDto> swaggerHubPost() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\n  \"date\" : \"2000-01-23\",\n  \"totalPay\" : 0.8008281904610115,\n  \"lastUpdatedAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"courierId\" : \"courierId\"\n}", SwaggerDto.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default SwaggerHubApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}

