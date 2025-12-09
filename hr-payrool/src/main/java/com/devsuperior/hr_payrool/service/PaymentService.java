package com.devsuperior.hr_payrool.service;

import com.devsuperior.hr_payrool.model.Payment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {


    public Payment getPayment(Long workeId, Long days) {
        return new Payment(1L, "doido", 200.0d, 10L, 500.0);
    }
}
