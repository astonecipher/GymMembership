package com.stonecipherprojects;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member("John", "Doe", "S"));
        members.add(new Member("Harry", "Lee", "G"));
        members.add(new Member("Sofia", "Long", "UE"));

        System.out.println("Membership Number\t\t\t\t\t\tType\t\t\tStart\t\tName\t\tJoin\tMember");

        for (Member member : members) {

            System.out.println(String.format("%s\t%s\t\t\t%s\t%s\t$%d\t\t$%d",
                    member.getMembershipNumber(),
                    member.getMembershipType().toString(),
                    member.getStartDate().toString(),
                    member.getName(),
                    member.membership.getJoiningFee(),
                    member.membership.getMembershipCost()));
        }

        // TODO Fix formatting issues
//        System.out.println(String.format("%s\t\t%s",
//                padLeft("Membership Number", " ", 32),
//                padLeft("Name", " ", 32)));
//        System.out.println(
//                String.format("%s\t%s",
//                        padLeft(members.get(0).getMembershipNumber(), " ", 32),
//                        padLeft(members.get(0).getName(), " ", 32)
//                )
//        );

    }

    public static String padLeft(String str, String padVal, int space) {
        String val = padVal;
        int initialCount = str.length();
        for (int i = 0; i <= (space - initialCount); i++) {
            val += padVal;
        }
        return String.format("%s%s", str, val);
    }
}
