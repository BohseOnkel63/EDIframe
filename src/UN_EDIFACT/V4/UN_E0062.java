package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0062  Message reference number  an..14
 * Unique message reference assigned by the sender.
 */
public class UN_E0062 extends Element {

    public UN_E0062() {
        this(null);
    }

    public UN_E0062(String Content) {
        super("0062", "Message reference number", "an..14", "Unique message reference assigned by the sender.");
        this.setContent(Content);
    }
}

