package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6060  Quantity  n..15
 * Numeric value of a quantity.
 */
public class E6060 extends Element {

    public E6060() {
        this(null);
    }

    public E6060(String Content) {
        super("6060", "Quantity", "n..15", "Numeric value of a quantity.", "");
        this.setContent(Content);
    }
}

