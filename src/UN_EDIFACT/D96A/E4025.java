package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4025  Business function, coded  an..3
 * Code describing the specific business function.
 */
public class E4025 extends Element {

    public E4025() {
        this(null);
    }

    public E4025(String Content) {
        super("4025", "Business function, coded", "an..3", "Code describing the specific business function.", "");
        this.setContent(Content);
    }
}

