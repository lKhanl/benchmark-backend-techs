package dev.oguzhanercelik.client;

import dev.oguzhanercelik.model.response.BenchmarkResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "springApiClient", url = "${spring.api.url}")
public interface SpringApiClient {

    @GetMapping
    BenchmarkResponse benchmark();

}
