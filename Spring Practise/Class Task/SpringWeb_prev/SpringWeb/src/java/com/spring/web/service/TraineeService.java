package com.spring.web.service;

import com.spring.web.service.impl.ITraineeService;
import com.spring.web.controller.BonusPolicy;
import com.spring.web.dao.impl.ITraineeDAO;
import com.spring.web.model.Trainee;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TraineeService implements ITraineeService {

    @Autowired
    ITraineeDAO traineeDAO;

    @Override
    public Trainee save(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        Date dateObject = new Date();
        String fronEndDateString = map.get("date")[0];
        String code = map.get("code")[0];
        String salary = map.get("salary")[0];
        double bonus = new BonusPolicy().traineeBonus(Integer.parseInt(code));
        double totalSalary = Double.parseDouble(salary) + bonus;

        Trainee trainee = new Trainee();
        //set value from front end params
        trainee.setCode(code);
        trainee.setName(map.get("name")[0]);
        trainee.setRound(map.get("round")[0]);
        trainee.setCourse(map.get("course")[0]);
        trainee.setEmail(map.get("email")[0]);
        trainee.setAddress(map.get("address")[0]);
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dateObject = simpleDate.parse(fronEndDateString);
        } catch (ParseException ex) {
            Logger.getLogger(TraineeService.class.getName()).log(Level.SEVERE, null, ex);
        }
        trainee.setDate(dateObject);
        trainee.setSalary(totalSalary);
        traineeDAO.save(trainee);
        return trainee;
    }

    @Override
    public List<Trainee> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Trainee update(Trainee employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Trainee delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Trainee getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Trainee save(Trainee trainee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
