package com.company.step3;

import com.company.common.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * The behaviour is now passed as an inline lambda expression.
 * Everything else remains the same.
 */
public class MainLambda {

    public static void main(String[] args) {
        List<Winline> lines = Utils.createWinlines();
        List<Winline> bigWins = filterWinlines(
                lines,
                wl -> wl.getMultiplier() >= 10
        );

        for (Winline line : bigWins) {
            System.out.println(line);
        }
    }

    static List<Winline> filterWinlines(List<Winline> winlines, Predicate<Winline> filter){
        ArrayList<Winline> result = new ArrayList<>();

        for (Winline line : winlines) {
            if(filter.test(line)){
                result.add(line);
            }
        }

        return result;
    }
}
