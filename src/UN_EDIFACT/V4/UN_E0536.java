package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0536  Certificate reference  an..35
 * Identifies one certificate for a certification authority.
 */
public class UN_E0536 extends Element {

    public UN_E0536() {
        this(null);
    }

    public UN_E0536(String Content) {
        super("0536", "Certificate reference", "an..35", "Identifies one certificate for a certification authority.");
        this.setContent(Content);
    }
}

