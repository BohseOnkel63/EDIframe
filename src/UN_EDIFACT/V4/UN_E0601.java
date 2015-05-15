package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0601  Padding mechanism code list identifier  an..3
 * Specification of the code list used to identify the padding mechanism or padding scheme.
 */
public class UN_E0601 extends Element {

    public UN_E0601() {
        this(null);
    }

    public UN_E0601(String Content) {
        super("0601", "Padding mechanism code list identifier", "an..3", "Specification of the code list used to identify the padding mechanism or padding scheme.");
        this.setContent(Content);
    }
}

