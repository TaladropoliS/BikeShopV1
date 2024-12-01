package com.ftv.bikeshopv1.models.dto;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "order_status")
    private String orderStatus;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "required_date")
    private Date requiredDate;

    @Column(name = "shipped_date")
    private Date shippedDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    @ToString.Exclude
    private CustomerDTO customer;

    @ManyToOne
    @JoinColumn(name = "store_id")
    @ToString.Exclude
    private StoreDTO store;

    @ManyToOne
    @JoinColumn(name = "staff_id")
    @ToString.Exclude
    private StaffDTO staff;
}
