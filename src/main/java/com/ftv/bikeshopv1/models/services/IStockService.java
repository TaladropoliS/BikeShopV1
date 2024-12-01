package com.ftv.bikeshopv1.models.services;

import com.ftv.bikeshopv1.models.dto.ProductDTO;
import com.ftv.bikeshopv1.models.dto.StockDTO;

import java.util.List;

public interface IStockService {

    List<StockDTO> findAll();

    void save(StockDTO stock);

    StockDTO findById(Integer id);

    void deleteById(Integer id);

    StockDTO findByProduct(ProductDTO product);
}
