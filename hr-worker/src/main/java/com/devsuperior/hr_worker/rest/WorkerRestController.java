package com.devsuperior.hr_worker.rest;

import com.devsuperior.hr_worker.model.Worker;
import com.devsuperior.hr_worker.service.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("worker")
@RequiredArgsConstructor
public class WorkerRestController {

    private final WorkerService workerService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/all.json")
    public List<Worker> getAll() {
        return workerService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}.json")
    public Optional<Worker> getId(@PathVariable Long id) {
        return workerService.findById(id);
    }


}
