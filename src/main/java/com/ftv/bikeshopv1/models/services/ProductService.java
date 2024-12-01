package com.ftv.bikeshopv1.models.services;

import com.ftv.bikeshopv1.models.dao.ProductDAO;
import com.ftv.bikeshopv1.models.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{

    @Autowired
    ProductDAO productDAO;

    @Override
    public List<ProductDTO> findAll() {
        List<ProductDTO> products = productDAO.findAll();
        return products;
    }

    @Override
    public void save(ProductDTO product) {
        productDAO.save(product);
    }

    @Override
    public ProductDTO findById(Integer id) {
        return productDAO.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        productDAO.deleteById(id);
    }
}
