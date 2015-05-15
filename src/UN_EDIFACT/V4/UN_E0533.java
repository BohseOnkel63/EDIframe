package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0533  Mode of operation code list identifier  an..3
 * Specification of the code list used to identify the cryptographic mode of operation.
 */
public class UN_E0533 extends Element {

    public UN_E0533() {
        this(null);
    }

    public UN_E0533(String Content) {
        super("0533", "Mode of operation code list identifier", "an..3", "Specification of the code list used to identify the cryptographic mode of operation.");
        this.setContent(Content);
    }
}

