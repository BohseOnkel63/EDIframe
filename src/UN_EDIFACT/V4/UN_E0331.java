package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0331  Report function, coded  an..3
 * Coded value identifying type of status or error report.
 */
public class UN_E0331 extends Element {

    public UN_E0331() {
        this(null);
    }

    public UN_E0331(String Content) {
        super("0331", "Report function, coded", "an..3", "Coded value identifying type of status or error report.");
        this.setContent(Content);
    }
}

