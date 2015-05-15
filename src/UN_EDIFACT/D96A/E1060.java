package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1060  Revision number  an..6
 * To specify a revision number.
 */
public class E1060 extends Element {

    public E1060() {
        this(null);
    }

    public E1060(String Content) {
        super("1060", "Revision number", "an..6", "To specify a revision number.", "");
        this.setContent(Content);
    }
}

