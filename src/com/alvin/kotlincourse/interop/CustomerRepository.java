package com.alvin.kotlincourse.interop;

import java.util.List;

public interface CustomerRepository {
    CustomerJava getById(int id);
    List<CustomerJava> getAll();
}
