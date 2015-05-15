package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0007  Identification code qualifier  an..4
 * Qualifier referring to the identification code.
 */
public class UN_E0007 extends Element {

    public UN_E0007() {
        this(null);
    }

    public UN_E0007(String Content) {
        super("0007", "Identification code qualifier", "an..4", "Qualifier referring to the identification code.");
        this.setContent(Content);
    }
}

