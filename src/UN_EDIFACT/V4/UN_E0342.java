package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0342  Dialogue version number  an..3
 * Version number of a dialogue.
 */
public class UN_E0342 extends Element {

    public UN_E0342() {
        this(null);
    }

    public UN_E0342(String Content) {
        super("0342", "Dialogue version number", "an..3", "Version number of a dialogue.");
        this.setContent(Content);
    }
}

