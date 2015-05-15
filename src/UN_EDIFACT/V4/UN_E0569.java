package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0569  Revocation reason, coded  an..3
 * Identification of the reason why the certificate has been revoked.
 */
public class UN_E0569 extends Element {

    public UN_E0569() {
        this(null);
    }

    public UN_E0569(String Content) {
        super("0569", "Revocation reason, coded", "an..3", "Identification of the reason why the certificate has been revoked.");
        this.setContent(Content);
    }
}

