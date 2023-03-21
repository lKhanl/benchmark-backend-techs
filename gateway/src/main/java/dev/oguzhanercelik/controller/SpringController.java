package dev.oguzhanercelik.controller;

import dev.oguzhanercelik.client.SpringApiClient;
import dev.oguzhanercelik.model.response.BenchmarkResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/spring")
public class SpringController {

    private final SpringApiClient springApiClient;

    @GetMapping
    public BenchmarkResponse benchmark() {
        return springApiClient.benchmark();
    }

}
