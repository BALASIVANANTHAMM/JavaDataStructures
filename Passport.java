package com.java;

public class Passport{
    int passNumber;
    String issuedBy;
    int firstIssued;
    String purpose;
    String eligibility;
    String expiration;
    int cost;

    public int getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(int passNumber) {
        this.passNumber = passNumber;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public int getFirstIssued() {
        return firstIssued;
    }

    public void setFirstIssued(int firstIssued) {
        this.firstIssued = firstIssued;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    Passport(int passNumber,
             String issuedBy,
             int firstIssued,
             String purpose,
             String eligibility,
             String expiration,
             int cost){
        this.passNumber=passNumber;
        this.issuedBy=issuedBy;
        this.firstIssued=firstIssued;
        this.purpose=purpose;
        this.eligibility=eligibility;
        this.expiration=expiration;
        this.cost=cost;
    }
}
