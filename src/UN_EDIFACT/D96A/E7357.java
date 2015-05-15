package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7357  Commodity/rate identification  an..18
 * Code identifying goods for Customs, transport or statistical purposes (generic term).
 */
public class E7357 extends Element {

    public E7357() {
        this(null);
    }

    public E7357(String Content) {
        super("7357", "Commodity/rate identification", "an..18", "Code identifying goods for Customs, transport or statistical purposes (generic term).", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

