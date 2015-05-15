package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0127  Scenario identification  an..14
 * Code identifying scenario.
 */
public class UN_E0127 extends Element {

    public UN_E0127() {
        this(null);
    }

    public UN_E0127(String Content) {
        super("0127", "Scenario identification", "an..14", "Code identifying scenario.");
        this.setContent(Content);
    }
}

