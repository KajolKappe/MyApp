package com.example.myapplication;

public class Card1Model {
    public String jobId, customerName, dateval, contactNumber, paperNumber;

    public Card1Model(){

    }

    public Card1Model(String jobId, String customerName, String dateval, String contactNumber, String paperNumber){
        this.jobId = jobId;
        this.customerName = customerName;
        this.dateval = dateval;
        this.contactNumber = contactNumber;
        this.paperNumber = paperNumber;
    }
}
