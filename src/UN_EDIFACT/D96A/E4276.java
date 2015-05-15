package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4276  Terms of payment  an..35
 * Conditions of payment between the parties to a transaction (generic term).
 */
public class E4276 extends Element {

    public E4276() {
        this(null);
    }

    public E4276(String Content) {
        super("4276", "Terms of payment", "an..35", "Conditions of payment between the parties to a transaction (generic term).", "");
        this.setContent(Content);
    }
}

