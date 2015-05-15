package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0565  Message relation, coded  an..3
 * Relationship with another message, past or future.
 */
public class UN_E0565 extends Element {

    public UN_E0565() {
        this(null);
    }

    public UN_E0565(String Content) {
        super("0565", "Message relation, coded", "an..3", "Relationship with another message, past or future.");
        this.setContent(Content);
    }
}

