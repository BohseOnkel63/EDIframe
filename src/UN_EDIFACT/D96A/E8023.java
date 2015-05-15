package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8023  Freight and charges identification  an..17
 * Coded description of freight charges and other charges (used in combination with 1131/3055).
 */
public class E8023 extends Element {

    public E8023() {
        this(null);
    }

    public E8023(String Content) {
        super("8023", "Freight and charges identification", "an..17", "Coded description of freight charges and other charges (used in combination with 1131/3055).", "Use UN/ECE Recommendation No. 23: Freight costs and charges.  If not applicable, use appropriate code in combination with 1131/3055.");
        this.setContent(Content);
    }
}

