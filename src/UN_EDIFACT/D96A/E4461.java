package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4461  Payment means, coded  an..3
 * Indication of the instrument of payment, which may include a guarantee.
 */
public class E4461 extends Element {

    public E4461() {
        this(null);
    }

    public E4461(String Content) {
        super("4461", "Payment means, coded", "an..3", "Indication of the instrument of payment, which may include a guarantee.", "");
        this.setContent(Content);
    }
}

