package com.devsuperior.hr_payrool.service;

import com.devsuperior.hr_payrool.model.Payment;
import com.devsuperior.hr_payrool.model.Worker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class PaymentService {

    @Value("${hr-worker.host}")
    private String host;

    private final RestTemplate restTemplate;

    public Payment getPayment(Long workeId, Long days) {
        Map<String, String> uri = new HashMap<>();
        uri.put("id", workeId.toString());
        log.info("WorkedID {}, {}", workeId, host+"/"+"worker/{id}");
        Worker worker = restTemplate.getForObject(host+"/"+"worker/{id}.json", Worker.class, uri);
        return new Payment(workeId, worker.getName(), worker.getDailyIncome(), days, worker.getDailyIncome() * days);
    }
}
