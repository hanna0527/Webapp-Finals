package com.member.model.dto;

import java.sql.Date;

public class MemberDTO implements java.io.Serializable{
    private int memberCode;
    private String memberName;
    private String birthDate;
    private String categoryName;
    private String categoryCode;
    private String introduce;
    private String contact;
    private String startDate;
    private String activeStatus;

    public MemberDTO () {}

    public MemberDTO(int memberCode, String memberName, String birthDate, String categoryCode, String introduce, String contact, String startDate, String activeStatus) {
        this.memberCode = memberCode;
        this.memberName = memberName;
        this.birthDate = birthDate;
        this.categoryCode = categoryCode;
        this.introduce = introduce;
        this.contact = contact;
        this.startDate = startDate;
        this.activeStatus = activeStatus;
    }

    public int getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(int memberCode) {
        this.memberCode = memberCode;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "memberCode=" + memberCode +
                ", memberName='" + memberName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", categoryCode='" + categoryCode + '\'' +
                ", introduce='" + introduce + '\'' +
                ", contact='" + contact + '\'' +
                ", startDate='" + startDate + '\'' +
                ", activeStatus='" + activeStatus + '\'' +
                '}';
    }
}
