package com.oliver;

import java.util.ArrayList;
import java.util.HashMap;

public class MnemonicCalculator {

    private HashMap<Character, String[]> map;
    private ArrayList<String> mnemonics;

    MnemonicCalculator() {

        map = new HashMap<Character, String[]>();
        map.put('2', new String[]{"A", "B", "C"});
        map.put('3', new String[]{"D", "E", "F"});
        map.put('4', new String[]{"G", "H", "I"});
        map.put('5', new String[]{"J", "K", "L"});
        map.put('6', new String[]{"M", "N", "O"});
        map.put('7', new String[]{"P", "Q", "R"});
        map.put('8', new String[]{"S", "T", "V"});
        map.put('9', new String[]{"W", "X", "Y", "Z"});
        mnemonics = new ArrayList<String>();
    }

    public ArrayList<String> calculateMnemonics(String number) {

        buildMnemonic(number, "");
        return mnemonics;
    }

    private void buildMnemonic(String number, String mnemonic) {

        if(number.isEmpty()) {
            mnemonics.add(mnemonic);
            return;
        }

        String[] letters = map.get(number.charAt(0));

        if(letters != null) {
            for (String l : letters) {
                buildMnemonic(number.substring(1), mnemonic + l);
            }
        } else {
            // Skip input characters that aren't 2 through 9 inclusive.
            buildMnemonic(number.substring(1), mnemonic);
        }
    }
}