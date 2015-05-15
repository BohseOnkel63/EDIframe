package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0333  Report reason, coded  an..3
 * Code identifying the reason for the status or error report.
 */
public class UN_E0333 extends Element {

    public UN_E0333() {
        this(null);
    }

    public UN_E0333(String Content) {
        super("0333", "Report reason, coded", "an..3", "Code identifying the reason for the status or error report.");
        this.setContent(Content);
    }
}

