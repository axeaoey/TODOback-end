package com.sicr.train.data.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;

    @Column(name = "student_code", length = 10, nullable = false, unique = true)
    private String studentCode;

    @Column(name = "first_name", length = 300, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 300, nullable = false)
    private String lastName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "gender", length = 100)
    private String gender;

    @Column(name = "province", length = 500)
    private String province;

    @Column(name = "address", length = 1000)
    private String address;

    @Column(name = "email", length = 320, unique = true)
    private String email;

    @CreationTimestamp
    @Column(name = "create_date", updatable = false)
    private LocalDateTime createDate;

    @UpdateTimestamp
    @Column(name = "update_date")
    private LocalDateTime updateDate;
}
