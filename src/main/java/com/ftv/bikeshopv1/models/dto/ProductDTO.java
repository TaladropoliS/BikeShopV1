package com.ftv.bikeshopv1.models.dto;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "model_year")
    private Integer modelYear;

    @Column(name = "list_price")
    private Double listPrice;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    @ToString.Exclude
    private BrandDTO brand;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @ToString.Exclude
    private CategoryDTO category;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private List<StockDTO> stock = new ArrayList<>();

}
