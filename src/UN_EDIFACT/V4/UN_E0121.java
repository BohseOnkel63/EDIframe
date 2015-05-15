package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0121  Message implementation guideline identification  an..14
 * Coded identification of the message implementation guideline, assigned by its controlling agency.
 */
public class UN_E0121 extends Element {

    public UN_E0121() {
        this(null);
    }

    public UN_E0121(String Content) {
        super("0121", "Message implementation guideline identification", "an..14", "Coded identification of the message implementation guideline, assigned by its controlling agency.");
        this.setContent(Content);
    }
}

