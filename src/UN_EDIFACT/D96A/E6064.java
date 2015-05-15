package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6064  Quantity difference  n..15
 * Numeric value of variance between ordered/shipped/invoiced quantities.
 */
public class E6064 extends Element {

    public E6064() {
        this(null);
    }

    public E6064(String Content) {
        super("6064", "Quantity difference", "n..15", "Numeric value of variance between ordered/shipped/invoiced quantities.", "");
        this.setContent(Content);
    }
}

