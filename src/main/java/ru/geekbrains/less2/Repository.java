package ru.geekbrains.less2;

import org.springframework.stereotype.Component;

@Component
public interface Repository {
    Product findById(Long id);

}
