package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0065  Message type  an..6
 * Code identifying a type of message and assigned by its controlling agency.
 */
public class UN_E0065 extends Element {

    public UN_E0065() {
        this(null);
    }

    public UN_E0065(String Content) {
        super("0065", "Message type", "an..6", "Code identifying a type of message and assigned by its controlling agency.");
        this.setContent(Content);
    }
}

