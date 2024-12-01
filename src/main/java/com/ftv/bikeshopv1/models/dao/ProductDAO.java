package com.ftv.bikeshopv1.models.dao;

import com.ftv.bikeshopv1.models.dto.ProductDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDAO extends JpaRepository<ProductDTO, Integer>{
}
