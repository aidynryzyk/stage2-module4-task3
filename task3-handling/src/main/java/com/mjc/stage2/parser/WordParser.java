package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponentType;

public class WordParser extends AbstractTextParser {
    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        char[] parts = string.toCharArray();
        for (char part:
                parts) {
            AbstractTextComponent inner = new SymbolLeaf(TextComponentType.SYMBOL, part);
            abstractTextComponent.add(inner);
        }
    }

    // Write your code here!

}
