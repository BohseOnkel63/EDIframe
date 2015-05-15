package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0110  Code list directory version number  an..6
 * Version number of the code list directory.
 */
public class UN_E0110 extends Element {

    public UN_E0110() {
        this(null);
    }

    public UN_E0110(String Content) {
        super("0110", "Code list directory version number", "an..6", "Version number of the code list directory.");
        this.setContent(Content);
    }
}

