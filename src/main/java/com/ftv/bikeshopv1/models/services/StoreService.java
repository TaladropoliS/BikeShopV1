package com.ftv.bikeshopv1.models.services;

import com.ftv.bikeshopv1.models.dao.StoreDAO;
import com.ftv.bikeshopv1.models.dto.StockDTO;
import com.ftv.bikeshopv1.models.dto.StoreDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService implements IStoreService {

    @Autowired
    StoreDAO storeDAO;

    @Override
    public List<StoreDTO> findAll() {
        List<StoreDTO> stores = storeDAO.findAll();
        return stores;
    }

    @Override
    public StoreDTO findById(Integer id) {
        return storeDAO.findById(id).orElse(null);
    }
}
