package com.ftv.bikeshopv1.models.services;

import com.ftv.bikeshopv1.models.dto.ProductDTO;
import com.ftv.bikeshopv1.models.dto.StockDTO;

import java.util.List;

public interface IStockService {

    List<StockDTO> findAll();

    void save(StockDTO stock);

    StockDTO findById(Integer id);

    void deleteById(Integer id);

    StockDTO findByProduct_ProductId(Integer productId);

    List<StockDTO> findByFilters(Integer storeId, Integer categoryId, Integer brandId);

}
