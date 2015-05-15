package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0130  Scenario release number  an..3
 * Release number within the scenario version number.
 */
public class UN_E0130 extends Element {

    public UN_E0130() {
        this(null);
    }

    public UN_E0130(String Content) {
        super("0130", "Scenario release number", "an..3", "Release number within the scenario version number.");
        this.setContent(Content);
    }
}

