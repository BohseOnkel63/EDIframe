package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4431  Payment guarantee, coded  an..3
 * Identification of the means of guarantee.
 */
public class E4431 extends Element {

    public E4431() {
        this(null);
    }

    public E4431(String Content) {
        super("4431", "Payment guarantee, coded", "an..3", "Identification of the means of guarantee.", "");
        this.setContent(Content);
    }
}

