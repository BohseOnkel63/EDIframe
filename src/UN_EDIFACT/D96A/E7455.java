package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7455  Membership level qualifier  an..3
 * Specification of the meaning of a membership level.
 */
public class E7455 extends Element {

    public E7455() {
        this(null);
    }

    public E7455(String Content) {
        super("7455", "Membership level qualifier", "an..3", "Specification of the meaning of a membership level.", "");
        this.setContent(Content);
    }
}

