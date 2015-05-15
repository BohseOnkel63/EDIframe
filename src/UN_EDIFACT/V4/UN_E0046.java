package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0046  Interchange recipient internal sub-identification  an..35
 * Sub-level of recipient internal identification, when further sub-level identification is required.
 */
public class UN_E0046 extends Element {

    public UN_E0046() {
        this(null);
    }

    public UN_E0046(String Content) {
        super("0046", "Interchange recipient internal sub-identification", "an..35", "Sub-level of recipient internal identification, when further sub-level identification is required.");
        this.setContent(Content);
    }
}

