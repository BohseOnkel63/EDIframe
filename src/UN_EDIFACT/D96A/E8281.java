package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8281  Transport ownership, coded  an..3
 * Code indicating the ownership of the means of transport.
 */
public class E8281 extends Element {

    public E8281() {
        this(null);
    }

    public E8281(String Content) {
        super("8281", "Transport ownership, coded", "an..3", "Code indicating the ownership of the means of transport.", "");
        this.setContent(Content);
    }
}

