package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9161  Code set indicator, coded  an..3
 * To indicate if a data element has an associated code set.
 */
public class E9161 extends Element {

    public E9161() {
        this(null);
    }

    public E9161(String Content) {
        super("9161", "Code set indicator, coded", "an..3", "To indicate if a data element has an associated code set.", "");
        this.setContent(Content);
    }
}

