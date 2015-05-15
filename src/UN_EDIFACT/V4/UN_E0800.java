package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0800  Package reference number  an..35
 * Unique package reference number assigned by the sender.
 */
public class UN_E0800 extends Element {

    public UN_E0800() {
        this(null);
    }

    public UN_E0800(String Content) {
        super("0800", "Package reference number", "an..35", "Unique package reference number assigned by the sender.");
        this.setContent(Content);
    }
}

