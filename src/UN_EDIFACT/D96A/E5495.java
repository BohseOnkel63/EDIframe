package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5495  Sub-line indicator, coded  an..3
 * Indication that the segment and/or segment group is used for sub-line item information.
 */
public class E5495 extends Element {

    public E5495() {
        this(null);
    }

    public E5495(String Content) {
        super("5495", "Sub-line indicator, coded", "an..3", "Indication that the segment and/or segment group is used for sub-line item information.", "");
        this.setContent(Content);
    }
}

