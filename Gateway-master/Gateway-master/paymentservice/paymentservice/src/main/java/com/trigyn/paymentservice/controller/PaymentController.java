package com.trigyn.paymentservice.controller;

import com.trigyn.paymentservice.service.PaymentService;
import com.trigyn.paymentservice.model.Payments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/paymentgateway")
public class PaymentController {

    @Autowired
    PaymentService paymentService;
    @GetMapping("/price")
    public List<Payments> getPaymentList(){
        return paymentService.getPaymentList();
    }
    @PostMapping("/priceadd")
    public Boolean addPaymentList(@RequestBody Payments payments){
        paymentService.addPaymentList(payments);
        return true;
    }
}
