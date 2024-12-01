package com.ftv.bikeshopv1.models.dao;

import com.ftv.bikeshopv1.models.dto.StockDTO;
import com.ftv.bikeshopv1.models.dto.StoreDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StockDAO extends JpaRepository<StockDTO, Integer> {

    Optional<StockDTO> findByProduct_ProductId(Integer productId);

    List<StockDTO> findByStore_StoreId(Integer storeId);
    List<StockDTO> findByProduct_Category_CategoryId(Integer categoryId);
    List<StockDTO> findByProduct_Brand_BrandId(Integer brandId);

    List<StockDTO> findByStore_StoreIdAndProduct_Category_CategoryId(Integer storeId, Integer categoryId);
    List<StockDTO> findByStore_StoreIdAndProduct_Brand_BrandId(Integer storeId, Integer brandId);
    List<StockDTO> findByProduct_Category_CategoryIdAndProduct_Brand_BrandId(Integer categoryId, Integer brandId);

    List<StockDTO> findByStore_StoreIdAndProduct_Category_CategoryIdAndProduct_Brand_BrandId(
            Integer storeId, Integer categoryId, Integer brandId);

}
