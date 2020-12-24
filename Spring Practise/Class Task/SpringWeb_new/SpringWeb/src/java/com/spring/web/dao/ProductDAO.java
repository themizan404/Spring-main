/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.web.dao;

import com.spring.web.model.Product;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Faculty Pc
 */

@Repository
@Transactional
public class ProductDAO {
    
    @Autowired
    SessionFactory sessionFactory;

 
    public void addProduct(Product p){
        sessionFactory.getCurrentSession().save(p);
        sessionFactory.getCurrentSession().flush();
    }

    public List<Product> getAllProducts(){
       List<Product> pList = sessionFactory.getCurrentSession().createCriteria(Product.class).list();
        for (Product pList1 : pList) {
            System.out.println(pList1.getProductCode());
        }
       return null;
    }
    

    public void updateProduct(Product p){
        sessionFactory.getCurrentSession().saveOrUpdate(p);
        sessionFactory.getCurrentSession().flush();
    }
    

    public void deleteProduct(Product p){
        sessionFactory.getCurrentSession().load(Product.class, 1);
        sessionFactory.getCurrentSession().delete(p);        
        sessionFactory.getCurrentSession().flush();
    }
    
   
    public void viewProductById(int id){
        Product p1 = (Product) sessionFactory.getCurrentSession().load(Product.class, 1);
        sessionFactory.getCurrentSession().flush();
    }
}
