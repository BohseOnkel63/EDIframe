package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1131  Code list qualifier  an..3
 * Identification of a code list.
 */
public class E1131 extends Element {

    public E1131() {
        this(null);
    }

    public E1131(String Content) {
        super("1131", "Code list qualifier", "an..3", "Identification of a code list.", "");
        this.setContent(Content);
    }
}

