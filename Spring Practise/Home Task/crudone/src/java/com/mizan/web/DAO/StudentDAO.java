package com.mizan.web.DAO;

import com.mizan.web.model.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class StudentDAO {

    @Autowired
    SessionFactory sessionFactory;

    public void save(Student student) {
        sessionFactory.getCurrentSession().save(student);

    }

}
