package com.mizan.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") delete ( "thatSillyCoach") TennisCoach class becomes default bean id with first letter lower-case
@Component
//@Scope("prototype")

public class TennisCoach implements Coach {
// 4.-------------------- define field annotation.

    @Autowired
//    @Qualifier("happyFortuneService")
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;
// 1.------------------------------ define parameter base constructor annotation
//    @Autowired 
//    public TennisCoach(FortuneService theFortuneService) {
//        fortuneService = theFortuneService;
//    }
    // define a default constructor

    public TennisCoach() {
        System.out.println(" >> TennisCoach inside default constructor << ");
    }
//   2. -------------------------- define a setter method
//    @Autowired
//    public void setFortuneService(FortuneService theFortuneService) {
//        System.out.println(" >> TennisCoach inside setter method << ");
//        this.fortuneService = theFortuneService;
//    }
//   3. ---------------define a custom method 
//    @Autowired
//    public void doSomeCrazyStuff(FortuneService theFortuneService) {
//        System.out.println(">> TennisCoach inside custom method <<");
//        fortuneService = theFortuneService;
//    }

    // 5.------------------ define my init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
    }

    // 6.------------------ define my destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
    }

    @Override
    public String getDailyWorkout() {
        return "Practise your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
