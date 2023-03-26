package dev.oguzhanercelik.controller;

import dev.oguzhanercelik.client.DotnetApiClient;
import dev.oguzhanercelik.model.response.BenchmarkResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dotnet")
public class DotnetController {

    private final DotnetApiClient dotnetApiClient;

    @GetMapping
    public BenchmarkResponse benchmark() {
        return dotnetApiClient.benchmark();
    }

}
