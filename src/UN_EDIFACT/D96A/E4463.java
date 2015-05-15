package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4463  Intra-company payment, coded  an..3
 * Indication that the payment is within one company.
 */
public class E4463 extends Element {

    public E4463() {
        this(null);
    }

    public E4463(String Content) {
        super("4463", "Intra-company payment, coded", "an..3", "Indication that the payment is within one company.", "");
        this.setContent(Content);
    }
}

