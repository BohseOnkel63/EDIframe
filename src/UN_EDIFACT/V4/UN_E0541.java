package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0541  Scope of security application, coded  an..3
 * Specification of the scope of application of the security service defined in the security header.
 */
public class UN_E0541 extends Element {

    public UN_E0541() {
        this(null);
    }

    public UN_E0541(String Content) {
        super("0541", "Scope of security application, coded", "an..3", "Specification of the scope of application of the security service defined in the security header.");
        this.setContent(Content);
    }
}

