package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0051  Controlling agency, coded  an..3
 * Code identifying a controlling agency.
 */
public class UN_E0051 extends Element {

    public UN_E0051() {
        this(null);
    }

    public UN_E0051(String Content) {
        super("0051", "Controlling agency, coded", "an..3", "Code identifying a controlling agency.");
        this.setContent(Content);
    }
}

