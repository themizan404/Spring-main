/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.annotation;

import java.util.Random;
import org.springframework.stereotype.Component;

/**
 *
 * @author mohdm
 */
@Component
public class RandomFortuneService implements FortuneService {

    // create an array of strings 
    private String[] data = {
        "Message One From RandomFortuneService ",
        "Message Two From RandomFortuneService ",
        "Message Three From RandomFortuneService "
    };
// create a rondom number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
// pick a random string from the array
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }

    @Override
    public void TryOne() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
