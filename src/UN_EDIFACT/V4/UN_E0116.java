package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0116  Message subset version number  an..3
 * Version number of the message subset.
 */
public class UN_E0116 extends Element {

    public UN_E0116() {
        this(null);
    }

    public UN_E0116(String Content) {
        super("0116", "Message subset version number", "an..3", "Version number of the message subset.");
        this.setContent(Content);
    }
}

