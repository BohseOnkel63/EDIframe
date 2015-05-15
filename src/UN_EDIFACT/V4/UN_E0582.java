package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0582  Number of padding bytes  n..2
 * Count of the number of padding bytes.
 */
public class UN_E0582 extends Element {

    public UN_E0582() {
        this(null);
    }

    public UN_E0582(String Content) {
        super("0582", "Number of padding bytes", "n..2", "Count of the number of padding bytes.");
        this.setContent(Content);
    }
}

