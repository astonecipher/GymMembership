package com.stonecipherprojects;

import com.sun.javaws.exceptions.InvalidArgumentException;

enum MembershipType {Student, General, UnderEighteen}

public class Membership {

    // Define fees for students
    private final int STUDENT_MEMBER_FEE = 55;
    private final int STUDENT_JOIN_FEE = 10;
    private final int STUDENT_COMP_FEE = 10;

    // Define fees for general
    private final int GENERAL_MEMBER_FEE = 100;
    private final int GENERAL_JOIN_FEE = 25;
    private final int GENERAL_COMP_FEE = 10;

    // Define fees for under 18
    private final int UNDER18_MEMBER_FEE = 35;
    private final int UNDER18_JOIN_FEE = 8;
    private final int UNDER18_COMP_FEE = 10;

    public Membership(MembershipType type) {
        setMembershipByType(type);
    }

    public Membership(int joiningFee, int membershipCost, int competitionCost) {
        setJoiningFee(joiningFee);
        setMembershipCost(membershipCost);
        setCompetitionCost(competitionCost);
    }


    public void setMembershipByType(MembershipType type) {
        switch (type) {
            case General:
                setMembershipCost(GENERAL_MEMBER_FEE);
                setJoiningFee(GENERAL_JOIN_FEE);
                setCompetitionCost(GENERAL_COMP_FEE);
                break;
            case Student:
                setMembershipCost(STUDENT_MEMBER_FEE);
                setJoiningFee(STUDENT_JOIN_FEE);
                setCompetitionCost(STUDENT_COMP_FEE);
                break;
            case UnderEighteen:
                setMembershipCost(UNDER18_MEMBER_FEE);
                setJoiningFee(UNDER18_JOIN_FEE);
                setCompetitionCost(UNDER18_COMP_FEE);
                break;
            default:
                throw new IllegalArgumentException("Invalid Membership Type");
        }
    }

    private int _joiningFee;

    public void setJoiningFee(int fee) {
        if (fee <= 0) throw new IllegalArgumentException("Fee must not be Zero.");
        _joiningFee = fee;
    }

    public int getJoiningFee() {
        return _joiningFee;
    }

    private int _membershipCost;

    public void setMembershipCost(int fee) {
        if (fee <= 0) throw new IllegalArgumentException("Fee must not be Zero.");
        _membershipCost = fee;
    }

    public int getMembershipCost() {
        return _membershipCost;
    }

    private int _competitionCost;

    public void setCompetitionCost(int fee) {
        if (fee <= 0) throw new IllegalArgumentException("Fee must not be Zero.");
        _competitionCost = fee;
    }

    public int getCompetitionCost() {
        return _competitionCost;
    }

    private MembershipType _membershipType;
    private void setMembershipType(MembershipType type) {
        _membershipType = type;
    }
    public MembershipType getMembershipType() {
        return _membershipType;
    }
}
