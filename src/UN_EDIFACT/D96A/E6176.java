package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6176  Maximum number of occurrences  n..7
 * To specify the maximum number of occurrences.
 */
public class E6176 extends Element {

    public E6176() {
        this(null);
    }

    public E6176(String Content) {
        super("6176", "Maximum number of occurrences", "n..7", "To specify the maximum number of occurrences.", "");
        this.setContent(Content);
    }
}

