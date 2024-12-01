package com.ftv.bikeshopv1.models.services;

import com.ftv.bikeshopv1.models.dao.CategoryDAO;
import com.ftv.bikeshopv1.models.dto.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    CategoryDAO categoryDAO;

    @Override
    public List<CategoryDTO> findAll() {
        List<CategoryDTO> categories = categoryDAO.findAll();
        return categories;
    }
}