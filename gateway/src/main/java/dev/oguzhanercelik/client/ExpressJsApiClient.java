package dev.oguzhanercelik.client;

import dev.oguzhanercelik.model.response.BenchmarkResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "expressApiClient", url = "${express.api.url}")
public interface ExpressJsApiClient {

    @GetMapping
    BenchmarkResponse benchmark();

}
