package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8051  Transport stage qualifier  an..3
 * Qualifier giving a specific meaning to the transport details.
 */
public class E8051 extends Element {

    public E8051() {
        this(null);
    }

    public E8051(String Content) {
        super("8051", "Transport stage qualifier", "an..3", "Qualifier giving a specific meaning to the transport details.", "");
        this.setContent(Content);
    }
}

