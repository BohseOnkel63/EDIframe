package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0048  Group reference number  an..14
 * Unique reference number for the group within an interchange.
 */
public class UN_E0048 extends Element {

    public UN_E0048() {
        this(null);
    }

    public UN_E0048(String Content) {
        super("0048", "Group reference number", "an..14", "Unique reference number for the group within an interchange.");
        this.setContent(Content);
    }
}

