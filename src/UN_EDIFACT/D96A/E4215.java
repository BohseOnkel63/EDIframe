package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4215  Transport charges method of payment, coded  an..3
 * Identification of method of payment for transport charges.
 */
public class E4215 extends Element {

    public E4215() {
        this(null);
    }

    public E4215(String Content) {
        super("4215", "Transport charges method of payment, coded", "an..3", "Identification of method of payment for transport charges.", "");
        this.setContent(Content);
    }
}

