
package com.sany;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class StudentDAO {
    @Autowired
    SessionFactory sessionFactory;
    
    public void save(Student s){
        sessionFactory.getCurrentSession().save(s);
        sessionFactory.getCurrentSession().flush();
    }
    public Student delete(int id){
        Student st=(Student) sessionFactory.getCurrentSession().load(Student.class, id);
        sessionFactory.getCurrentSession().delete(st);
        sessionFactory.getCurrentSession().flush();
        return st;
    }
    
    public Student update(Student student) {
        sessionFactory.getCurrentSession().saveOrUpdate(student);
        sessionFactory.getCurrentSession().flush();
        return student;
    }
    
    public List<Student> getAll(){
        List <Student> studentList=sessionFactory.getCurrentSession().createCriteria(Student.class).list();
        sessionFactory.getCurrentSession().flush();
        return studentList;
    }
    
    public Student getById(int id) {
        Student employee = (Student) sessionFactory.getCurrentSession().get(Student.class, id);
        sessionFactory.getCurrentSession().flush();
        return employee;
    }
}
