package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4277  Terms of payment identification  an..17
 * Identification of the terms of payment between the parties to a transaction (generic term).
 */
public class E4277 extends Element {

    public E4277() {
        this(null);
    }

    public E4277(String Content) {
        super("4277", "Terms of payment identification", "an..17", "Identification of the terms of payment between the parties to a transaction (generic term).", "Use UN/ECE Recommendation No. 17 Payterms.  If not applicable, use appropriate code set in combination with 1131/3055, or values underneath.");
        this.setContent(Content);
    }
}

