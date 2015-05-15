package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4487  Type of financial transaction, coded  an..3
 * Specification of the type of a financial transaction in coded form.
 */
public class E4487 extends Element {

    public E4487() {
        this(null);
    }

    public E4487(String Content) {
        super("4487", "Type of financial transaction, coded", "an..3", "Specification of the type of a financial transaction in coded form.", "");
        this.setContent(Content);
    }
}

