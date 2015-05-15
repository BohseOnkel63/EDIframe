package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0133  Character encoding, coded  an..3
 * Coded identification of the character encoding used in the interchange.
 */
public class UN_E0133 extends Element {

    public UN_E0133() {
        this(null);
    }

    public UN_E0133(String Content) {
        super("0133", "Character encoding, coded", "an..3", "Coded identification of the character encoding used in the interchange.");
        this.setContent(Content);
    }
}

