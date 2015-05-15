package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0136  Erroneous data element occurrence  n..6
 * The numerical occurrence of the repeating stand-alone or composite data element in error. Each occurrence (as indicated by the repetition separator) shall cause the count to be incremented. The count starts at 1.
 */
public class UN_E0136 extends Element {

    public UN_E0136() {
        this(null);
    }

    public UN_E0136(String Content) {
        super("0136", "Erroneous data element occurrence", "n..6", "The numerical occurrence of the repeating stand-alone or composite data element in error. Each occurrence (as indicated by the repetition separator) shall cause the count to be incremented. The count starts at 1.");
        this.setContent(Content);
    }
}

