package ru.geekbrains.less2;

import org.springframework.stereotype.Component;

@Component
public class SecondRepository implements Repository{

    @Override
    public Product findById(Long id) {
        return new Product("testTitle", 1L, 10);
    }
}
