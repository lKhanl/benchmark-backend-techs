package dev.oguzhanercelik.client;

import dev.oguzhanercelik.model.response.BenchmarkResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "ginApiClient", url = "${gin.api.url}")
public interface GinApiClient {

    @GetMapping
    BenchmarkResponse benchmark();

}
