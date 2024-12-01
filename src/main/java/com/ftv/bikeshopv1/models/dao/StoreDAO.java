package com.ftv.bikeshopv1.models.dao;

import com.ftv.bikeshopv1.models.dto.StoreDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreDAO extends JpaRepository<StoreDTO, Integer>{
}
