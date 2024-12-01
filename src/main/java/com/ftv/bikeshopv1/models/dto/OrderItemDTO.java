package com.ftv.bikeshopv1.models.dto;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "order_items")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Integer itemId;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "list_price")
    private Double listPrice;

    @Column(name = "discount")
    private Double discount;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @ToString.Exclude
    private ProductDTO product;

    @ManyToOne
    @JoinColumn(name = "order_id")
    @ToString.Exclude
    private OrderDTO order;

}
