package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0545  Certificate syntax and version, coded  an..3
 * Coded identification of the syntax and version used to create the certificate.
 */
public class UN_E0545 extends Element {

    public UN_E0545() {
        this(null);
    }

    public UN_E0545(String Content) {
        super("0545", "Certificate syntax and version, coded", "an..3", "Coded identification of the syntax and version used to create the certificate.");
        this.setContent(Content);
    }
}

