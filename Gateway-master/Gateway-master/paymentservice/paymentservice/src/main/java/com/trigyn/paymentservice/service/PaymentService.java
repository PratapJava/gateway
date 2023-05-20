package com.trigyn.paymentservice.service;


import com.trigyn.paymentservice.model.Payments;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentService {

    List<Payments> paymentsList = new ArrayList<>();
    public List<Payments> getPaymentList() {
    return paymentsList;
    }

    public Boolean addPaymentList(Payments payments) {
        paymentsList.add(payments);
        return true;
    }
}
