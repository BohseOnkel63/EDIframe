package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5283  Duty/tax/fee function qualifier  an..3
 * Code identifying the function of an duty, tax or fee information.
 */
public class E5283 extends Element {

    public E5283() {
        this(null);
    }

    public E5283(String Content) {
        super("5283", "Duty/tax/fee function qualifier", "an..3", "Code identifying the function of an duty, tax or fee information.", "");
        this.setContent(Content);
    }
}

