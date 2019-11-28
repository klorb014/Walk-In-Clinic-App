package com.example.walkin_clinic_ui;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WalkinClinic {

    public String name;
    public String insuranceType;
    public String address;
    public String phoneNumber;
    public ArrayList<Service> services;
    public Schedule schedule;


    public WalkinClinic(){}

    public WalkinClinic(String name,String insurance, String phoneNumber, String address){
        this.name = name;
        this.insuranceType = insurance;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.services = new ArrayList<Service>();
        services.add(new Service("12345","Admin","Staff"));

        this.schedule = new Schedule();
    }

    public String getName(){ return this.name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getInsuranceType(){ return this.insuranceType; }

    public Schedule getSchedule(){ return this.schedule; }

    public void setSchedule(Schedule sched) {this.schedule = sched;}

    public void setAddress(String address) {
        this.address = address;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() { return this.address; }

    //public ArrayList<String> getServices() { return this.services; }

    public String getPhoneNumber() { return this.phoneNumber; }



    public void setServices(ArrayList<Service> services){
        this.services = services;
    }

}
