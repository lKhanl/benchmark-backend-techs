package dev.oguzhanercelik.controller;

import dev.oguzhanercelik.client.ExpressJsApiClient;
import dev.oguzhanercelik.model.response.BenchmarkResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/express")
public class ExpressJsController {

    private final ExpressJsApiClient expressJsApiClient;

    @GetMapping
    public BenchmarkResponse benchmark() {
        return expressJsApiClient.benchmark();
    }

}
