package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5273  Duty/tax/fee rate basis identification  an..12
 * Identification of the various elements of tax combination to be attributed to a commodity.
 */
public class E5273 extends Element {

    public E5273() {
        this(null);
    }

    public E5273(String Content) {
        super("5273", "Duty/tax/fee rate basis identification", "an..12", "Identification of the various elements of tax combination to be attributed to a commodity.", "");
        this.setContent(Content);
    }
}

