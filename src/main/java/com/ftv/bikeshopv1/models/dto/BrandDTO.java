package com.ftv.bikeshopv1.models.dto;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "brands")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BrandDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private Integer brandId;

    @Column(name = "brand_name")
    private String brandName;

    @OneToMany(mappedBy = "brand")
    @ToString.Exclude  // Agregar esta anotación
    private List<ProductDTO> products;
}
