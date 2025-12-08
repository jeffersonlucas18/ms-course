package com.devsuperior.hr_worker.service;

import com.devsuperior.hr_worker.model.Worker;
import com.devsuperior.hr_worker.repository.WorkerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Service
public class WorkerService {

    private final WorkerRepository workerRepository;

    public List<Worker> findAll() {
        return workerRepository.findAll();
    }

    public Optional<Worker> findById(Long id) {
        return workerRepository.findById(id);
    }
}
