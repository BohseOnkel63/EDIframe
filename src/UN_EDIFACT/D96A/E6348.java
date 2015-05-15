package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6348  Currency rate base  n..4
 * Multiplying factor used in expressing the number of currency units.
 */
public class E6348 extends Element {

    public E6348() {
        this(null);
    }

    public E6348(String Content) {
        super("6348", "Currency rate base", "n..4", "Multiplying factor used in expressing the number of currency units.", "");
        this.setContent(Content);
    }
}

