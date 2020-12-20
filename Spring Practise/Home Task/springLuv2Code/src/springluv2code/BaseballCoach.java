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
public class BaseballCoach implements Coach {

    public FortuneService fortuneService;
// define the contructor base dependency injection.  

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "This is baseballCoach class";
    }

    @Override
    public String getDailyFurtune() {
        return fortuneService.getFortune();
    }

}
