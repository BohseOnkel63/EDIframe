package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0128  Scenario version number  an..3
 * Version number of a scenario.
 */
public class UN_E0128 extends Element {

    public UN_E0128() {
        this(null);
    }

    public UN_E0128(String Content) {
        super("0128", "Scenario version number", "an..3", "Version number of a scenario.");
        this.setContent(Content);
    }
}

