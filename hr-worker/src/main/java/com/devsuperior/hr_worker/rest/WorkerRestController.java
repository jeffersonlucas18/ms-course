package com.devsuperior.hr_worker.rest;

import com.devsuperior.hr_worker.model.Worker;
import com.devsuperior.hr_worker.service.WorkerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("worker")
@RequiredArgsConstructor
public class WorkerRestController {

    private final Environment environment;

    private final WorkerService workerService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/all.json")
    public List<Worker> getAll() {
        return workerService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}.json")
    public Optional<Worker> getId(@PathVariable Long id) {
        log.info("PORT= {}", environment.getProperty("local.server.port"));
        return workerService.findById(id);
    }


}
