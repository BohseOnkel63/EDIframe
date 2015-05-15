package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6167  Range type qualifier  an..3
 * Identification of the type of range.
 */
public class E6167 extends Element {

    public E6167() {
        this(null);
    }

    public E6167(String Content) {
        super("6167", "Range type qualifier", "an..3", "Identification of the type of range.", "");
        this.setContent(Content);
    }
}

