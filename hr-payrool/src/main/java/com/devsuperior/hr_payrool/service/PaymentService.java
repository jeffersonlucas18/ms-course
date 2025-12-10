package com.devsuperior.hr_payrool.service;

import com.devsuperior.hr_payrool.feignClient.WorkerFeignClient;
import com.devsuperior.hr_payrool.model.Payment;
import com.devsuperior.hr_payrool.model.Worker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class PaymentService {


    private final RestTemplate restTemplate;

    private final WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workeId, Long days) {
        Optional<Worker> worker = workerFeignClient.getId(workeId);
        return new Payment(workeId, worker.get().getName(), worker.get().getDailyIncome(), days, worker.get().getDailyIncome() * days);
    }
}
