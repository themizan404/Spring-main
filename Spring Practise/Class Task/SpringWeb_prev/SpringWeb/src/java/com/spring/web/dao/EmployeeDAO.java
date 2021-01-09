package com.spring.web.dao;

import com.spring.web.dao.impl.IEmployeeDAO;
import com.spring.web.model.Employee;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class EmployeeDAO implements IEmployeeDAO {

    @Autowired
    SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override

    public Employee save(Employee employee) {
        // ######################### save by manual session ###########################
        /*
         Session ss = sessionFactory.openSession();
         Transaction t = ss.beginTransaction();
         ss.persist(employee);
         t.commit();
         ss.close();
         */
        // ######################### save by automatic hibernate transaction ###############
        sessionFactory.getCurrentSession().save(employee);
        sessionFactory.getCurrentSession().flush();
        return employee;
    }

    @Override

    public Employee update(Employee employee) {
        sessionFactory.getCurrentSession().saveOrUpdate(employee);
        sessionFactory.getCurrentSession().flush();
        return employee;
    }

    @Override

    public Employee delete(int id) {
        //        ######################### delete by manual session ###########################
        /*
         String sql = "delete employee where id = '"+id+"'";
         int delete = getSessionFactory().openSession().createQuery(sql).executeUpdate();
         */
        //      ######################### delete by automatic hibernate transaction ############
        Employee emp = (Employee) sessionFactory.getCurrentSession().load(Employee.class, id);
        sessionFactory.getCurrentSession().delete(emp);
        sessionFactory.getCurrentSession().flush();
        return emp;
    }

    @Override

    public Employee getById(int id) {
        //        ######################### get single employee by manual session ##############
        /*
         String sql = "from employee where id = '" + id + "'";
         List<Employee> empList = getSessionFactory().openSession().createQuery(sql).list();
         System.out.println(empList.get(0).getName());
         */
        //      ######################### get by automatic hibernate transaction ###############
        Employee employee = (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
        sessionFactory.getCurrentSession().flush();
        return employee;
    }

    @Override

    public List<Employee> getAll() {
        //        ######################### getall by manual session ###########################
        /*
         String sql = "from employee";
         List<Employee> empList = getSessionFactory().openSession().createQuery(sql).list();
         for (Employee employee : empList) {
         System.out.println(employee.getName());
         }
         */
        //      ######################### getall by automatic hibernate transaction ##############
        List<Employee> empList = sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
        sessionFactory.getCurrentSession().flush();
        return empList;
    }

}
