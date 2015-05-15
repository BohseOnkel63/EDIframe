package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0118  Message subset release number  an..3
 * Release number within the message subset version number.
 */
public class UN_E0118 extends Element {

    public UN_E0118() {
        this(null);
    }

    public UN_E0118(String Content) {
        super("0118", "Message subset release number", "an..3", "Release number within the message subset version number.");
        this.setContent(Content);
    }
}

