package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0558  List parameter  an..70
 * Specification of the list requested or delivered.
 */
public class UN_E0558 extends Element {

    public UN_E0558() {
        this(null);
    }

    public UN_E0558(String Content) {
        super("0558", "List parameter", "an..70", "Specification of the list requested or delivered.");
        this.setContent(Content);
    }
}

