/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.service;

import com.mizan.dao.PatientDao;
import com.mizan.model.Patient;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mohdm
 */
@Service
public class PatientService {

    @Autowired
    PatientDao patientDao;

    public void save(HttpServletRequest request) {
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        Patient patient = new Patient();
        patient.setName(name);
        patient.setAddress(address);

        patientDao.save(patient);
    }

    public List<Patient> getAll() {
        List<Patient> patients = patientDao.getAll();

        return patients;
    }

    public Patient delete(int id) {
        return patientDao.delete(id);

    }

    public Patient getById(int id) {// for edit method....
        Patient pt = patientDao.getById(id);

        return pt;

    }

    public void update(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        Patient patient = new Patient();
        patient.setId(id);
        patient.setName(name);
        patient.setAddress(address);

        patientDao.update(patient);
    }
}
