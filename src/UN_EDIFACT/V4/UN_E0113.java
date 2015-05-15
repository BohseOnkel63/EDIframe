package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0113  Message type sub-function identification  an..6
 * Code identifying a sub-function of a message type.
 */
public class UN_E0113 extends Element {

    public UN_E0113() {
        this(null);
    }

    public UN_E0113(String Content) {
        super("0113", "Message type sub-function identification", "an..6", "Code identifying a sub-function of a message type.");
        this.setContent(Content);
    }
}

