package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0567  Security status, coded  an..3
 * Identification of the security element (key or certificate, for instance) status.
 */
public class UN_E0567 extends Element {

    public UN_E0567() {
        this(null);
    }

    public UN_E0567(String Content) {
        super("0567", "Security status, coded", "an..3", "Identification of the security element (key or certificate, for instance) status.");
        this.setContent(Content);
    }
}

