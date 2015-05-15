package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9003  Employment qualifier  an..3
 * Specification of the meaning of employment details.
 */
public class E9003 extends Element {

    public E9003() {
        this(null);
    }

    public E9003(String Content) {
        super("9003", "Employment qualifier", "an..3", "Specification of the meaning of employment details.", "");
        this.setContent(Content);
    }
}

