package com.ftv.bikeshopv1.models.services;

import com.ftv.bikeshopv1.models.dao.StockDAO;
import com.ftv.bikeshopv1.models.dto.ProductDTO;
import com.ftv.bikeshopv1.models.dto.StockDTO;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService implements IStockService {

    @Autowired
    StockDAO stockDAO;

    @Override
    public List<StockDTO> findAll() {
        List<StockDTO> stocks = stockDAO.findAll();
        return stocks;
    }

    @Override
    public void save(StockDTO stock) {
        stockDAO.save(stock);

    }

    @Override
    public StockDTO findById(Integer id) {
        return stockDAO.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        stockDAO.deleteById(id);
    }

    @Override
    public StockDTO findByProduct_ProductId(Integer productId) {
        return stockDAO.findByProduct_ProductId(productId).orElse(null);
    }

    public List<StockDTO> findByFilters(Integer storeId, Integer categoryId, Integer brandId) {
        // Si todos los filtros están presentes
        if (storeId != null && categoryId != null && brandId != null) {
            return stockDAO.findByStore_StoreIdAndProduct_Category_CategoryIdAndProduct_Brand_BrandId(
                    storeId, categoryId, brandId);
        }

        // Si hay dos filtros
        if (storeId != null && categoryId != null) {
            return stockDAO.findByStore_StoreIdAndProduct_Category_CategoryId(storeId, categoryId);
        }
        if (storeId != null && brandId != null) {
            return stockDAO.findByStore_StoreIdAndProduct_Brand_BrandId(storeId, brandId);
        }
        if (categoryId != null && brandId != null) {
            return stockDAO.findByProduct_Category_CategoryIdAndProduct_Brand_BrandId(categoryId, brandId);
        }

        // Si hay un solo filtro
        if (storeId != null) {
            return stockDAO.findByStore_StoreId(storeId);
        }
        if (categoryId != null) {
            return stockDAO.findByProduct_Category_CategoryId(categoryId);
        }
        if (brandId != null) {
            return stockDAO.findByProduct_Brand_BrandId(brandId);
        }

        // Si no hay filtros, devolver todos
        return stockDAO.findAll();
    }

}
