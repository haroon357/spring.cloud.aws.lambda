package com.haroon.lambda.function;

import com.haroon.lambda.mock.MockCustomerRepo;
import com.haroon.lambda.model.Customer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.function.Supplier;

@RequiredArgsConstructor
@Component(value = "getCustomerFunc")
@Slf4j
public class GetCustomerFunction implements Supplier<Flux<Customer>> {

    private final MockCustomerRepo mockCustomerRepo;
    @Override
    public Flux<Customer> get() {
        log.info("getting customers");
        return mockCustomerRepo.getCustomers();
    }
}
