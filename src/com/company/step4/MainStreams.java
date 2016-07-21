package com.company.step4;

import com.company.common.*;

import java.util.List;

/**
 * Streams are introduced to severely reduce the amount of code.
 * 1. List of lines is turned into a stream
 * 2. Stream is filtered with lambda expression
 * 3. System.out.println is passed as a method reference to be executed for each result
 */
public class MainStreams {

    public static void main(String[] args) {
        List<Winline> lines = Utils.createWinlines();

        lines.stream()
                .filter(wl -> wl.getMultiplier() >= 10)
                .forEach(System.out::println);
    }
}
