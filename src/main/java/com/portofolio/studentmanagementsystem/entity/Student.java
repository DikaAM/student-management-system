package com.portofolio.studentmanagementsystem.entity;

import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Table(name = "students")
@Data
@SQLDelete(sql = "UPDATE students SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    private boolean deleted = Boolean.FALSE;




}
