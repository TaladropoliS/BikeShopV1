package com.ftv.bikeshopv1.models.services;

import com.ftv.bikeshopv1.models.dao.BrandDAO;
import com.ftv.bikeshopv1.models.dto.BrandDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService implements IBrandService{

    @Autowired
    BrandDAO brandDAO;

    @Override
    public List<BrandDTO> findAll() {
        List<BrandDTO> brands = brandDAO.findAll();
        return brands;
    }
}