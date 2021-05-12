package com.hrms.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name="seekers")
public class Seeker {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="nationality_id")
    private long nationalId;

    @Column(name="date_of_birth")
    private Date dateOfBirth;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="is_confirmed")
    private Boolean isComfirmed;
}
