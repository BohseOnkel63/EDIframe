package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0340  Interactive message reference number  an..35
 * Unique interactive message reference assigned by the sender.
 */
public class UN_E0340 extends Element {

    public UN_E0340() {
        this(null);
    }

    public UN_E0340(String Content) {
        super("0340", "Interactive message reference number", "an..35", "Unique interactive message reference assigned by the sender.");
        this.setContent(Content);
    }
}

