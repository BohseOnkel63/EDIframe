package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0503  Response type, coded  an..3
 * Specification of the type of response expected from the recipient.
 */
public class UN_E0503 extends Element {

    public UN_E0503() {
        this(null);
    }

    public UN_E0503(String Content) {
        super("0503", "Response type, coded", "an..3", "Specification of the type of response expected from the recipient.");
        this.setContent(Content);
    }
}

