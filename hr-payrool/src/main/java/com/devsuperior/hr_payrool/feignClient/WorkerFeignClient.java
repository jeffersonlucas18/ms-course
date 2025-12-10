package com.devsuperior.hr_payrool.feignClient;

import com.devsuperior.hr_payrool.model.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Optional;

@Component
@FeignClient(name = "hr-worker", url = "localhost:8001", path = "/worker")
public interface WorkerFeignClient {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}.json")
    public Optional<Worker> getId(@PathVariable Long id);
}
