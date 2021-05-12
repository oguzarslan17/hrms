package com.hrms.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name="applies")
public class Apply {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="seeker_id")
    private int seekerId;

    @Column(name="company_id")
    private int companyId;

    @Column(name="apply_date")
    private Date applyDate;
}
