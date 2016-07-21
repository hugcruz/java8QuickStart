package com.company.step1;

import com.company.common.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Java 6 compatible version: an anonymous inner class is used to
 * pass the behaviour into "filterWinLines" method.
 */
public class Main {

    public static void main(String[] args) {
        List<Winline> lines = Utils.createWinlines();


        List<Winline> bigWins = filterWinlines(lines, new Filter() {
            @Override
            public boolean filter(Winline line) {
                return line.getMultiplier() >= 10;
            }
        });


        for (Winline line : bigWins) {
            System.out.println(line);
        }
    }

    private static List<Winline> filterWinlines(List<Winline> winlines, Filter filter){
        ArrayList<Winline> result = new ArrayList<Winline>();

        for (Winline line : winlines) {
            if(filter.filter(line)){
                result.add(line);
            }
        }

        return result;
    }
}
