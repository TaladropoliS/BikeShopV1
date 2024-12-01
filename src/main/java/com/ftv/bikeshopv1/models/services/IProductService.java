package com.ftv.bikeshopv1.models.services;

import com.ftv.bikeshopv1.models.dto.ProductDTO;

import java.util.List;

public interface IProductService {

    List<ProductDTO> findAll();

    void save(ProductDTO product);

    ProductDTO findById(Integer id);

    void deleteById(Integer id);
}
