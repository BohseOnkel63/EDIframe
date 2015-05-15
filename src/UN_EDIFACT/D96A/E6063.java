package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6063  Quantity qualifier  an..3
 * Code giving specific meaning to a quantity.
 */
public class E6063 extends Element {

    public E6063() {
        this(null);
    }

    public E6063(String Content) {
        super("6063", "Quantity qualifier", "an..3", "Code giving specific meaning to a quantity.", "");
        this.setContent(Content);
    }
}

