package com.ftv.bikeshopv1.models.services;

import com.ftv.bikeshopv1.models.dto.CategoryDTO;

import java.util.List;

public interface ICategoryService {

    List<CategoryDTO> findAll();

}
