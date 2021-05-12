package com.hrms.hrms.controllers.concretes;

import com.hrms.hrms.controllers.abstracts.JopService;
import com.hrms.hrms.dataAccess.abstracts.JopDao;
import com.hrms.hrms.entities.concretes.Jop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JopManager implements JopService {

    @Autowired
    private JopDao jopDao;

    @Override
    public List<Jop> getAll() {
        return jopDao.findAll();
    }
}
