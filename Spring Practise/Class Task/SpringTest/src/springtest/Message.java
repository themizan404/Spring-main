/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springtest;

/**
 *
 * @author A9
 */
public class Message {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Message(String msg) {
        this.msg = msg;
    }

    public void show() {
        System.out.println();
    }
}
