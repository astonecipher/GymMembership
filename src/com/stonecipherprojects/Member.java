package com.stonecipherprojects;

import sun.security.util.AuthResources_fr;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Member {

    public Member(String first, String last, MembershipType type) {
        setFirstName(first);
        setLastName(last);
        setMembershipNumber();
        setStartDate();
        membership = new Membership(type);
    }

    public Membership membership;

    private MembershipType _membershipType;
    public void setMembershipType(MembershipType type) {
        _membershipType = type;
    }
    public MembershipType getMembershipType() {
        return _membershipType;
    }

    public String getName() {
        return String.format("%s, %s", getLastName(), getFirstName());
    }

    private String _firstname;

    public void setFirstName(String name) {
        _firstname = name;
    }

    public String getFirstName() {
        return _firstname;
    }

    private String _lastname;

    public void setLastName(String name) {
        _lastname = name;
    }
    public String getLastName() {
        return _lastname;
    }

    private UUID _membershipNumber;

    private void setMembershipNumber() {
        _membershipNumber = UUID.randomUUID();
    }

    public String getMembershipNumber() {
        return _membershipNumber.toString();
    }

    private Date _startDate;

    public void setStartDate() {
        _startDate = new Date();
    }

    public String getStartDate() {
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
        return dt1.format(_startDate);
    }
}
