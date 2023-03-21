package dev.oguzhanercelik.controller;

import dev.oguzhanercelik.client.GinApiClient;
import dev.oguzhanercelik.model.response.BenchmarkResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/gin")
public class GinController {

    private final GinApiClient ginApiClient;

    @GetMapping
    public BenchmarkResponse benchmark() {
        return ginApiClient.benchmark();
    }

}
