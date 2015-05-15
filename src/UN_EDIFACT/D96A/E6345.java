package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6345  Currency, coded  an..3
 * Identification of the name or symbol of the monetary unit involved in the transaction.
 */
public class E6345 extends Element {

    public E6345() {
        this(null);
    }

    public E6345(String Content) {
        super("6345", "Currency, coded", "an..3", "Identification of the name or symbol of the monetary unit involved in the transaction.", "Use ISO 4217 three alpha code.");
        this.setContent(Content);
    }
}

