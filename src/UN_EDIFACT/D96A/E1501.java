package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1501  Computer environment details qualifier  an..3
 * A code to identify the computer environment details.
 */
public class E1501 extends Element {

    public E1501() {
        this(null);
    }

    public E1501(String Content) {
        super("1501", "Computer environment details qualifier", "an..3", "A code to identify the computer environment details.", "");
        this.setContent(Content);
    }
}

