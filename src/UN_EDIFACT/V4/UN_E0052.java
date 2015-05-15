package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0052  Message version number  an..3
 * Version number of a message type.
 */
public class UN_E0052 extends Element {

    public UN_E0052() {
        this(null);
    }

    public UN_E0052(String Content) {
        super("0052", "Message version number", "an..3", "Version number of a message type.");
        this.setContent(Content);
    }
}

