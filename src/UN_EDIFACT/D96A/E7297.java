package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7297  Set identification qualifier  an..3
 * Identification of the type of set.
 */
public class E7297 extends Element {

    public E7297() {
        this(null);
    }

    public E7297(String Content) {
        super("7297", "Set identification qualifier", "an..3", "Identification of the type of set.", "");
        this.setContent(Content);
    }
}

