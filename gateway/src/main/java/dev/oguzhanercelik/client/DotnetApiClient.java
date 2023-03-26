package dev.oguzhanercelik.client;

import dev.oguzhanercelik.model.response.BenchmarkResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "dotnetApiClient", url = "${dotnet.api.url}")
public interface DotnetApiClient {

    @GetMapping
    BenchmarkResponse benchmark();

}
