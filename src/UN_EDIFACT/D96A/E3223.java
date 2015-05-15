package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3223  Related place/location one identification  an..25
 * Specification of the first related place/location by code.
 */
public class E3223 extends Element {

    public E3223() {
        this(null);
    }

    public E3223(String Content) {
        super("3223", "Related place/location one identification", "an..25", "Specification of the first related place/location by code.", "Use UN/ECE Recommendation No. 16: UNLOCODE.  If not applicable, use appropriate code set in combination with 1131/3055.");
        this.setContent(Content);
    }
}

