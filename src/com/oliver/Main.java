package com.oliver;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        MnemonicCalculator mc = new MnemonicCalculator();
        ArrayList<String> mnemonics = mc.calculateMnemonics("2276696");

        for(String s : mnemonics) {
            System.out.println(s);
        }
    }
}