package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0563  Validation value, qualifier  an..3
 * Identification of the type of validation value.
 */
public class UN_E0563 extends Element {

    public UN_E0563() {
        this(null);
    }

    public UN_E0563(String Content) {
        super("0563", "Validation value, qualifier", "an..3", "Identification of the type of validation value.");
        this.setContent(Content);
    }
}

