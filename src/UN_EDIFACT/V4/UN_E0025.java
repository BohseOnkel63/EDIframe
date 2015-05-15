package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0025  Recipient reference/password qualifier  an2
 * Qualifier for the recipient's reference or password.
 */
public class UN_E0025 extends Element {

    public UN_E0025() {
        this(null);
    }

    public UN_E0025(String Content) {
        super("0025", "Recipient reference/password qualifier", "an2", "Qualifier for the recipient's reference or password.");
        this.setContent(Content);
    }
}

