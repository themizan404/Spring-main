/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.java.coupling;

/**
 *
 * @author Faculty Pc
 */
public class Toyota {
    public void model(){
        autoCallBefore();
        System.out.println("Model - Toyota");
        autoCallAfter();
    }
    
       private void autoCallBefore(){
           System.out.println("Before");
       }
       
       private void autoCallAfter(){
           System.out.println("After");
       }
}
