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
public class TrackCoach implements Coach {

    public FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "This is TrackCoach class";
    }

    @Override
    public String getDailyFurtune() {
        return "Just do it : " + fortuneService.getFortune();
    }

}
