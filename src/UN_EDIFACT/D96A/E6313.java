package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6313  Measurement dimension, coded  an..3
 * Specification of the type of dimension to be measured.
 */
public class E6313 extends Element {

    public E6313() {
        this(null);
    }

    public E6313(String Content) {
        super("6313", "Measurement dimension, coded", "an..3", "Specification of the type of dimension to be measured.", "");
        this.setContent(Content);
    }
}

