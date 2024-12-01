package com.ftv.bikeshopv1.models.dto;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "staffs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_id")
    private Integer staffId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "active")
    private Boolean active;

    @ManyToOne
    @JoinColumn(name = "store_id")
    @ToString.Exclude
    private StoreDTO store;

}
