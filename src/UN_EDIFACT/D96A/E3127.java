package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3127  Carrier identification  an..17
 * Identification of party undertaking or arranging transport of goods between named points.
 */
public class E3127 extends Element {

    public E3127() {
        this(null);
    }

    public E3127(String Content) {
        super("3127", "Carrier identification", "an..17", "Identification of party undertaking or arranging transport of goods between named points.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

