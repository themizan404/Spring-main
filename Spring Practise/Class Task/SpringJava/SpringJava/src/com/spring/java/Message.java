/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.java;

import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author Faculty Pc
 */
public class Message implements InitializingBean, DisposableBean {

    private TraineeMessage traineeMessage;
    private TraineeMessage traineeMessage1;

    public TraineeMessage getTraineeMessage() {
        return traineeMessage;
    }

    public void setTraineeMessage(TraineeMessage traineeMessage) {
        this.traineeMessage = traineeMessage;
    }

    public TraineeMessage getTraineeMessage1() {
        return traineeMessage1;
    }

    public void setTraineeMessage1(TraineeMessage traineeMessage1) {
        this.traineeMessage1 = traineeMessage1;
    }

    private String msg;
    private int msgCount;
    private String newMsg;
    private List<String> stringLists;

    private List<TraineeMessage> traineeMessageList;

    public Message() {
    }

    public Message(String msg) {
        //System.out.println("String msg");
        this.msg = msg;
    }
//    public Message(int msgCount) {
//        System.out.println("int msgCount");
//        this.msgCount = msgCount;
//    }
//    public Message(String msg, int msgCount) {
//        System.out.println("String msg, int msgCount");
//        this.msg = msg;
//        this.msgCount = msgCount;
//    }
//
//    public Message(String msg, int msgCount, String newMsg) {
//            System.out.println("String msg, int msgCount, String newMsg");
//        this.msg = msg;
//        this.msgCount = msgCount;
//        this.newMsg = newMsg;
//    }
//
//    public Message(TraineeMessage traineeMessage) {
//        this.traineeMessage = traineeMessage;
//    }
//
//    public Message(String msg, int msgCount, String newMsg, TraineeMessage traineeMessage) {
//        this.msg = msg;
//        this.msgCount = msgCount;
//        this.newMsg = newMsg;
//        this.traineeMessage = traineeMessage;
//    }
//
//    public Message(List<TraineeMessage> traineeMessageList) {
//        this.traineeMessageList = traineeMessageList;
//    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void showMessage() {
        System.out.println(msg + " " + msgCount + " " + newMsg + " " + traineeMessage);
//         for (Iterator<TraineeMessage> iterator = traineeMessageList.iterator(); iterator.hasNext();) {
//            //String next = iterator.next();
//            while(iterator.hasNext()){
//                System.out.println(iterator.next());
//            }
//        }
    }

    public void startBean() {
        System.out.println("Bean initializing");
    }

    public void destroyBean() {
        System.out.println("Bean Destroying++");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Before Interface Init++");
        
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("After Interface destroy");
    }
}
