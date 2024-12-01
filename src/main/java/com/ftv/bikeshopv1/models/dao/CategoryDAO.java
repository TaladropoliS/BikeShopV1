package com.ftv.bikeshopv1.models.dao;

import com.ftv.bikeshopv1.models.dto.CategoryDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDAO extends JpaRepository<CategoryDTO, Integer>{
}
