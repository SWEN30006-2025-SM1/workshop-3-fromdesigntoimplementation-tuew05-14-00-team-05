package com.unimelb.swen30006.workshops;

public class Student extends Person{
    private String email;
    private String studentID;
    private Submission submission;

    public void sendEmailMsg(String message){
    }

    public float totalGrade() {
        return (float) 100;
    }
}
