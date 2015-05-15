package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0548  Service character for signature  an..4
 * Service character used when the signature was computed.
 */
public class UN_E0548 extends Element {

    public UN_E0548() {
        this(null);
    }

    public UN_E0548(String Content) {
        super("0548", "Service character for signature", "an..4", "Service character used when the signature was computed.");
        this.setContent(Content);
    }
}

