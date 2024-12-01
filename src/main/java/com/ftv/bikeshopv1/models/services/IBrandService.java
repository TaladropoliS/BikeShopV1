package com.ftv.bikeshopv1.models.services;

import com.ftv.bikeshopv1.models.dto.BrandDTO;

import java.util.List;

public interface IBrandService {

    List<BrandDTO> findAll();

}
