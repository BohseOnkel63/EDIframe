package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5249  Percentage basis, coded  an..3
 * Indication of the application of a percentage.
 */
public class E5249 extends Element {

    public E5249() {
        this(null);
    }

    public E5249(String Content) {
        super("5249", "Percentage basis, coded", "an..3", "Indication of the application of a percentage.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

