package com.ftv.bikeshopv1.models.dao;

import com.ftv.bikeshopv1.models.dto.ProductDTO;
import com.ftv.bikeshopv1.models.dto.StockDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StockDAO extends JpaRepository<StockDTO, Integer>{

    Optional<StockDTO> findByProduct(ProductDTO product);

}
