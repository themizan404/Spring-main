/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springluv2code;

/**
 *
 * @author mohdm
 */
public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("no-arg constructor in CricketCoach");
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {

        return "Practecing daily";
    }

    @Override
    public String getDailyFurtune() {
        return fortuneService.getFortune();
    }

}
