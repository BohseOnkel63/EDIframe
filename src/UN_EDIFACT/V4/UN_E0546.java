package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0546  User authorisation level  an..35
 * Specification of the authorisation level associated with the owner of the certificate.
 */
public class UN_E0546 extends Element {

    public UN_E0546() {
        this(null);
    }

    public UN_E0546(String Content) {
        super("0546", "User authorisation level", "an..35", "Specification of the authorisation level associated with the owner of the certificate.");
        this.setContent(Content);
    }
}

