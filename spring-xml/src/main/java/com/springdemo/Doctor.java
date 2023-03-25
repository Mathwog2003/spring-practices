package com.springdemo;

public class Doctor implements staff {

        private String qualification;

    public Doctor(String qualification) {
        this.qualification = qualification;
    }

    public void assist(){
        System.out.println("doctor is assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
