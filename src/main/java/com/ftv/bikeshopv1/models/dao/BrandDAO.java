package com.ftv.bikeshopv1.models.dao;

import com.ftv.bikeshopv1.models.dto.BrandDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandDAO extends JpaRepository<BrandDTO, Integer>{
}
