package com.company.step2;


import com.company.common.Winline;

public class Filters {
    public static boolean bigWins(Winline line){
        return line.getMultiplier() >= 10;
    }
}
