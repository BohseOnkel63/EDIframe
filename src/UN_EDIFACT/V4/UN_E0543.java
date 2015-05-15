package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0543  Certificate original character set repertoire, coded  an..3
 * Identification of the character set repertoire used to create the certificate it was signed.
 */
public class UN_E0543 extends Element {

    public UN_E0543() {
        this(null);
    }

    public UN_E0543(String Content) {
        super("0543", "Certificate original character set repertoire, coded", "an..3", "Identification of the character set repertoire used to create the certificate it was signed.");
        this.setContent(Content);
    }
}

