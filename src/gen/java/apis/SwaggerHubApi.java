package apis;

import dto.SwaggerDto;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/swagger-hub")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2024-06-11T12:13:27.596726596Z[GMT]")
public interface SwaggerHubApi {

    @GET
    @Produces({ "application/json" })
    @Operation(summary = "Get api", description = "Get api", tags={ "swagger-hub" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Get api", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SwaggerDto.class))) })
    SwaggerDto swaggerHubGet();
    @POST
    @Produces({ "application/json" })
    @Operation(summary = "Post api", description = "Post api", tags={ "swagger-hub" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Post api.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = SwaggerDto.class))) })
    SwaggerDto swaggerHubPost();}
