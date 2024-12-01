package com.ftv.bikeshopv1.models.services;

import com.ftv.bikeshopv1.models.dao.StockDAO;
import com.ftv.bikeshopv1.models.dto.ProductDTO;
import com.ftv.bikeshopv1.models.dto.StockDTO;
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
        return stockDAO.findAll();
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
    public StockDTO findByProduct(ProductDTO product) {
        return stockDAO.findByProduct(product).orElse(null);
    }
}
