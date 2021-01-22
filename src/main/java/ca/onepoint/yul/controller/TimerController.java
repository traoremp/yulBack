package ca.onepoint.yul.controller;

import ca.onepoint.yul.ApplicationStartup;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/timer")
public class TimerController {


    @Operation(summary = "Get the time in seconds")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Get the time",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Integer.class))}),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Time not found",
                    content = @Content)})
    @CrossOrigin
    @GetMapping("/")
    public Integer getTheTime() {
        return ApplicationStartup.secondes;
    }


}
