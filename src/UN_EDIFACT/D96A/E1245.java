package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1245  Status indicator, coded  an..3
 * Specification of a status or disposition.
 */
public class E1245 extends Element {

    public E1245() {
        this(null);
    }

    public E1245(String Content) {
        super("1245", "Status indicator, coded", "an..3", "Specification of a status or disposition.", "");
        this.setContent(Content);
    }
}

