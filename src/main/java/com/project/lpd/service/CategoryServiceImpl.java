package com.project.lpd.service;

import com.project.lpd.entity.CategoryEntity;
import com.project.lpd.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepo categoryRepo;


    @Override
    public List<CategoryEntity> getAllCategory() {
        return categoryRepo.findAll();
    }

    @Override
    public CategoryEntity getCategoryById(int id) {
        return categoryRepo.getById(id);
    }

    @Override
    public CategoryEntity createCategory(CategoryEntity p) {
        return categoryRepo.save(p);
    }

    @Override
    public void deleteCategory(int id) {
        categoryRepo.deleteById(id);
    }

    @Override
    public CategoryEntity updateCategory(CategoryEntity p) {
        return categoryRepo.save(p);
    }
        @Override
    public CategoryEntity getCategoryByName(String name) {
        return categoryRepo.findByName(name);
    }

    @Override
    public List<CategoryEntity> getCategoryByFullName(String name) {
        return categoryRepo.findByFullName(name);
    }

    @Override
    public int getTotalPage(Pageable pageable) {
        return categoryRepo.findAll(pageable).getTotalPages();
    }

    @Override
    public CategoryEntity getFullCategorys(String name) {
        return categoryRepo.findByName(name);
    }

    @Override
    public List<CategoryEntity> getAll(Pageable pageable) {
        return categoryRepo.findAll(pageable).getContent();
    }






}
