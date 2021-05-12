package com.hrms.hrms.dataAccess.abstracts;

import com.hrms.hrms.entities.concretes.Jop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JopDao extends JpaRepository<Jop, Integer> {

}
