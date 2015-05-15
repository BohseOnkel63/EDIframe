package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0551  Service character for signature qualifier  an..3
 * Identification of the type of service character used when the signature was computed.
 */
public class UN_E0551 extends Element {

    public UN_E0551() {
        this(null);
    }

    public UN_E0551(String Content) {
        super("0551", "Service character for signature qualifier", "an..3", "Identification of the type of service character used when the signature was computed.");
        this.setContent(Content);
    }
}

