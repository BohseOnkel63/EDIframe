package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9007  Qualification classification, coded  an..3
 * Identification of a qualification classification.
 */
public class E9007 extends Element {

    public E9007() {
        this(null);
    }

    public E9007(String Content) {
        super("9007", "Qualification classification, coded", "an..3", "Identification of a qualification classification.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

