package com.spring.web.controller;


public class BonusPolicy {

    public double traineeBonus(int traineeCode) {
        if (traineeCode == 100) {
            return 5000.00;
        } else if (traineeCode == 200) {
            return 3000.00;
        } else {
            return 2000.00;
        }
    }
}
