package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;

public class WordParser extends AbstractTextParser {
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        for (char symbol : string.toCharArray()) {
            AbstractTextComponent symbolLeaf = new SymbolLeaf(symbol);
            abstractTextComponent.add(symbolLeaf);
        }
    }

}
