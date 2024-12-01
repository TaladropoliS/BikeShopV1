package com.ftv.bikeshopv1.models.services;

import com.ftv.bikeshopv1.models.dto.StoreDTO;

import java.util.List;

public interface IStoreService {

    List<StoreDTO> findAll();

}
