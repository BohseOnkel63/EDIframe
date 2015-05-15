package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6162  Range minimum  n..18
 * Minimum of a range.
 */
public class E6162 extends Element {

    public E6162() {
        this(null);
    }

    public E6162(String Content) {
        super("6162", "Range minimum", "n..18", "Minimum of a range.", "");
        this.setContent(Content);
    }
}

