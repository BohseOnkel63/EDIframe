package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0332  Report reason text  an..70
 * Textual explanation of the reason for the status or error report.
 */
public class UN_E0332 extends Element {

    public UN_E0332() {
        this(null);
    }

    public UN_E0332(String Content) {
        super("0332", "Report reason text", "an..70", "Textual explanation of the reason for the status or error report.");
        this.setContent(Content);
    }
}

