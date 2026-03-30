package org.example;

import java.util.ArrayList;

public class Profiler {
    // TODO : Profiler 구현
    ArrayList<Integer> input;
    SortServiceLib sortServiceLib;


    public void setData (ArrayList<Integer> input) {
        this.input = input;
    };

    public void setLib (SortServiceLib sortServiceLib) {
        this.sortServiceLib = sortServiceLib;
    };

    public void runLib () {
        sortServiceLib.sort(input);
    };

    public void showResult () {
        System.out.println(sortServiceLib.getSortedArr());
        System.out.println(sortServiceLib.getChangeCount());
    }

}
