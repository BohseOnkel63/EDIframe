package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6341  Currency market exchange, coded  an..3
 * Code identifying the market upon which the currency exchange rate is based.
 */
public class E6341 extends Element {

    public E6341() {
        this(null);
    }

    public E6341(String Content) {
        super("6341", "Currency market exchange, coded", "an..3", "Code identifying the market upon which the currency exchange rate is based.", "");
        this.setContent(Content);
    }
}

