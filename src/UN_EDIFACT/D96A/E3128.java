package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3128  Carrier name  an..35
 * Name of party undertaking or arranging transport of goods between named points.
 */
public class E3128 extends Element {

    public E3128() {
        this(null);
    }

    public E3128(String Content) {
        super("3128", "Carrier name", "an..35", "Name of party undertaking or arranging transport of goods between named points.", "");
        this.setContent(Content);
    }
}

