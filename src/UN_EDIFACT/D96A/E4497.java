package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4497  Insurance cover type, coded  an..3
 * Specification of the meaning of the insurance cover.
 */
public class E4497 extends Element {

    public E4497() {
        this(null);
    }

    public E4497(String Content) {
        super("4497", "Insurance cover type, coded", "an..3", "Specification of the meaning of the insurance cover.", "");
        this.setContent(Content);
    }
}

