package com.hrms.hrms.business;

import com.hrms.hrms.controllers.abstracts.JopService;
import com.hrms.hrms.entities.concretes.Jop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jops")
public class JopPositionsController {

    @Autowired
    private JopService jopService;

    @GetMapping("/getAll")
    public List<Jop> getAll(){
        return jopService.getAll();
    }
}
