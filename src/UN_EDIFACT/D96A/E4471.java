package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4471  Settlement, coded  an..3
 * Indication of how allowances or charges are to be settled.
 */
public class E4471 extends Element {

    public E4471() {
        this(null);
    }

    public E4471(String Content) {
        super("4471", "Settlement, coded", "an..3", "Indication of how allowances or charges are to be settled.", "");
        this.setContent(Content);
    }
}

