package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1476  Control agency  an..2
 * Identification of the agency controlling the specification, maintenance and publication of the message.
 */
public class E1476 extends Element {

    public E1476() {
        this(null);
    }

    public E1476(String Content) {
        super("1476", "Control agency", "an..2", "Identification of the agency controlling the specification, maintenance and publication of the message.", "");
        this.setContent(Content);
    }
}

