package com.manuel.gestor.category.service;

import com.manuel.gestor.category.model.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service

@RequiredArgsConstructor

public class CategoryService {

    private final CategoryRepository categoryRepository;
}
