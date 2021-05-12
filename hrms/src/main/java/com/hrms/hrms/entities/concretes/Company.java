package com.hrms.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="companies")
public class Company {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="company_name")
    private String companyName;

    @Column(name="email")
    private String email;

    @Column(name="web_site")
    private String webSite;

    @Column(name="phone_number")
    private String phoneNumber;
}
