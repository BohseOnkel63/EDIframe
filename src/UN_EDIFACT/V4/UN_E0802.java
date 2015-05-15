package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0802  Reference identification number  an..35
 * Reference number to identify a message, message group and/or interchange, which relates to the object.
 */
public class UN_E0802 extends Element {

    public UN_E0802() {
        this(null);
    }

    public UN_E0802(String Content) {
        super("0802", "Reference identification number", "an..35", "Reference number to identify a message, message group and/or interchange, which relates to the object.");
        this.setContent(Content);
    }
}

