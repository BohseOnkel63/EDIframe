package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6311  Measurement application qualifier  an..3
 * Specification of the application of the physical measurement used.
 */
public class E6311 extends Element {

    public E6311() {
        this(null);
    }

    public E6311(String Content) {
        super("6311", "Measurement application qualifier", "an..3", "Specification of the application of the physical measurement used.", "");
        this.setContent(Content);
    }
}

