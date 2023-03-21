package dev.oguzhanercelik.controller;

import dev.oguzhanercelik.model.response.BenchmarkResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class BenchmarkController {

    @GetMapping
    public BenchmarkResponse benchmark() {

        final long startTime = System.nanoTime();
        long result = 1;
        for (int i = 1; i < 1_000; i++) {
            result += i;
        }
        final long endTime = System.nanoTime();
        final long time = (endTime - startTime);

        return BenchmarkResponse.builder()
                .time(time)
                .result(result)
                .tech("Spring Boot")
                .build();
    }

}
