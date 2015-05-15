package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0572  Certificate sequence number  n..4
 * Specification of a certificate's position within a certification path.
 */
public class UN_E0572 extends Element {

    public UN_E0572() {
        this(null);
    }

    public UN_E0572(String Content) {
        super("0572", "Certificate sequence number", "n..4", "Specification of a certificate's position within a certification path.");
        this.setContent(Content);
    }
}

