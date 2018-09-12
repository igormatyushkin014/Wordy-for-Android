package com.visuality.wordy.effects;

public class InversionEffect extends Effect {

    public InversionEffect() {
        super();
    }

    @Override
    public String getFilteredText(String sourceText) {
        char[] sourceSymbols = sourceText.toCharArray();
        StringBuilder resultStringBuilder = new StringBuilder();

        for (int symbolIndex = sourceSymbols.length - 1; symbolIndex >= 0; symbolIndex--) {
            char symbol = sourceSymbols[symbolIndex];
            resultStringBuilder.append(
                    symbol
            );
        }

        return resultStringBuilder.toString();
    }
}
