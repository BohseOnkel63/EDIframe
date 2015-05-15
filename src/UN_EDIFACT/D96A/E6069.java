package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6069  Control qualifier  an..3
 * Determines the source data elements in the message which forms the basis for 6066 Control value.
 */
public class E6069 extends Element {

    public E6069() {
        this(null);
    }

    public E6069(String Content) {
        super("6069", "Control qualifier", "an..3", "Determines the source data elements in the message which forms the basis for 6066 Control value.", "");
        this.setContent(Content);
    }
}

