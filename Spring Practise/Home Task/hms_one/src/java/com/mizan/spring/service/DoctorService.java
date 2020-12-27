/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.spring.service;

import com.mizan.spring.dao.DoctorDao;
import com.mizan.spring.model.Doctor;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mohdm
 */
@Service
public class DoctorService {

    @Autowired
    DoctorDao doctorDao;

    public Doctor save(HttpServletRequest request) {
        String name = request.getParameter("name");
        String degree = request.getParameter("degree");

        Doctor doctor = new Doctor();
        doctor.setName(name);
        doctor.setDegree(degree);
        return doctorDao.save(doctor);
    }

    public List<Doctor> getAll() {
        List<Doctor> docList = doctorDao.getAll();
        return docList;
    }

}
