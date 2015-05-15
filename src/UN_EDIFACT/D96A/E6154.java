package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6154  Measurement attribute  an..70
 * To specify non-discrete measurement values.
 */
public class E6154 extends Element {

    public E6154() {
        this(null);
    }

    public E6154(String Content) {
        super("6154", "Measurement attribute", "an..70", "To specify non-discrete measurement values.", "");
        this.setContent(Content);
    }
}

