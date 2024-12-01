package com.ftv.bikeshopv1.models.dto;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "stocks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stock_id")
    private Integer stockId;

    @Column(name = "quantity")
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @ToString.Exclude
    private ProductDTO product;

    @ManyToOne
    @JoinColumn(name = "store_id")
    @ToString.Exclude
    private StoreDTO store;

}
