package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1490  Consolidation item number  n..4
 * Serial number differentiating each separate consignment included in the consolidation.
 */
public class E1490 extends Element {

    public E1490() {
        this(null);
    }

    public E1490(String Content) {
        super("1490", "Consolidation item number", "n..4", "Serial number differentiating each separate consignment included in the consolidation.", "");
        this.setContent(Content);
    }
}

