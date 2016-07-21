package com.company.step2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.company.common.*;

/**
 * 1. The behaviour from the anonymous inner class is moved to a separate class.
 * 2. (Java8) a method reference is passed to the filterWinLines method
 * 3. (Java8) filterWinLines receives a Predicate<Winline> instead of a custom interface
 */
public class MainMethodReference {

    public static void main(String[] args) {
        List<Winline> lines = Utils.createWinlines();
        List<Winline> bigWins = filterWinlines(lines, Filters::bigWins);

        for (Winline line : bigWins) {
            System.out.println(line);
        }
    }

    private static List<Winline> filterWinlines(List<Winline> winlines, Predicate<Winline> filter){
        ArrayList<Winline> result = new ArrayList<>();

        for (Winline line : winlines) {
            if(filter.test(line)){
                result.add(line);
            }
        }

        return result;
    }
}
