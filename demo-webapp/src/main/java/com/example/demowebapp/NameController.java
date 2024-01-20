package com.example.demowebapp;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/v1/names")
public class NameController {
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST")
    })
    @Operation(summary = "Gets \"Hello\" plus your name back")
    @GetMapping(path = "/name")
    public String name(
            @RequestParam(value = "name", required = true) String name) {
        return "Ciao " + name + "!";
    }
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST")
    })
    @Operation(summary = "Gets yours name reversed back")
    @PostMapping("/reversed")
    public String reverse(
            @RequestBody String name
    ){
        StringBuilder revName = new StringBuilder(name);
        return revName.reverse().toString();
    }
}