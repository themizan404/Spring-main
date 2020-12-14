/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.java;

/**
 *
 * @author Faculty Pc
 */
public class TraineeMessage {

    private String msg1;
    private String msg2;
    private String msg3;

    public TraineeMessage() {
        
    }

    public TraineeMessage(String msg1, String msg2, String msg3) {
        this.msg1 = msg1;
        this.msg2 = msg2;
        this.msg3 = msg3;
    }

    @Override
    public String toString() {
        return msg1 + " " + msg2 + " " + msg3; //To change body of generated methods, choose Tools | Templates.
    }

}
