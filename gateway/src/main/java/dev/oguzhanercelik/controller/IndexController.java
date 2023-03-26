package dev.oguzhanercelik.controller;

import dev.oguzhanercelik.client.DotnetApiClient;
import dev.oguzhanercelik.client.ExpressJsApiClient;
import dev.oguzhanercelik.client.GinApiClient;
import dev.oguzhanercelik.client.SpringApiClient;
import dev.oguzhanercelik.model.response.BenchmarkResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class IndexController {

    private final GinApiClient ginApiClient;
    private final SpringApiClient springApiClient;
    private final DotnetApiClient dotnetApiClient;
    private final ExpressJsApiClient expressJsApiClient;

    @GetMapping
    public List<BenchmarkResponse> benchmarkAll() {
        return List.of(ginApiClient.benchmark(),
                       springApiClient.benchmark(),
                       dotnetApiClient.benchmark(),
                       expressJsApiClient.benchmark());
    }

}
