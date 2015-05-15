package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0042  Interchange sender internal sub-identification  an..35
 * Sub-level of sender internal identification, when further sub-level identification is required.
 */
public class UN_E0042 extends Element {

    public UN_E0042() {
        this(null);
    }

    public UN_E0042(String Content) {
        super("0042", "Interchange sender internal sub-identification", "an..35", "Sub-level of sender internal identification, when further sub-level identification is required.");
        this.setContent(Content);
    }
}

