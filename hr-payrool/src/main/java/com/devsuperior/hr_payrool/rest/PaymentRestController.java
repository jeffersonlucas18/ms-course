package com.devsuperior.hr_payrool.rest;

import com.devsuperior.hr_payrool.model.Payment;
import com.devsuperior.hr_payrool.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("payment")
@RequiredArgsConstructor
public class PaymentRestController {

    private final PaymentService paymentService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{workerId}/days/{days}")
    public Payment getPayment(@PathVariable Long workerId, @PathVariable Long days) {
        return paymentService.getPayment(workerId,days);
    }
}
