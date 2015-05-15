package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0002  Syntax version number  an1
 * Version number of the syntax.
 */
public class UN_E0002 extends Element {

    public UN_E0002() {
        this(null);
    }

    public UN_E0002(String Content) {
        super("0002", "Syntax version number", "an1", "Version number of the syntax.");
        this.setContent(Content);
    }
}

