package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6432  Significant digits  n..2
 * To specify the number of significant digits.
 */
public class E6432 extends Element {

    public E6432() {
        this(null);
    }

    public E6432(String Content) {
        super("6432", "Significant digits", "n..2", "To specify the number of significant digits.", "");
        this.setContent(Content);
    }
}

