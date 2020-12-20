/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.annotation;

/**
 *
 * @author mohdm
 */
public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "This is a sad day";
    }

    @Override
    public void TryOne() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
    }

}
