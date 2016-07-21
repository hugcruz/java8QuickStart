package com.company.common;

import com.company.common.Winline;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<Winline> createWinlines(){
        ArrayList<Winline> result = new ArrayList<Winline>();

        result.add(new Winline("A", 1, 5, true));
        result.add(new Winline("B", 2, 10, true));
        result.add(new Winline("C", 3, 50, true));
        result.add(new Winline("D", 4, 2, true));
        result.add(new Winline("E", 5, 5, true));

        return result;
    }
}
