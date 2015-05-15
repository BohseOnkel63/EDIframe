package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0517  Date and time qualifier  an..3
 * Specification of the type of date and time.
 */
public class UN_E0517 extends Element {

    public UN_E0517() {
        this(null);
    }

    public UN_E0517(String Content) {
        super("0517", "Date and time qualifier", "an..3", "Specification of the type of date and time.");
        this.setContent(Content);
    }
}

