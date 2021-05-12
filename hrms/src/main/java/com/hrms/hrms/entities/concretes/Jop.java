package com.hrms.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name ="jops")
public class Jop {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    
    @Column(name="jop_title")
    private String jopName;

}
