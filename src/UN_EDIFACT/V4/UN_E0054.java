package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0054  Message release number  an..3
 * Release number within the current message version number.
 */
public class UN_E0054 extends Element {

    public UN_E0054() {
        this(null);
    }

    public UN_E0054(String Content) {
        super("0054", "Message release number", "an..3", "Release number within the current message version number.");
        this.setContent(Content);
    }
}

