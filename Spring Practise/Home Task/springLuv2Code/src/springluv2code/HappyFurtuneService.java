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
public class HappyFurtuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "This is FortuneService class implements by FortuneService interface";
    }

}
