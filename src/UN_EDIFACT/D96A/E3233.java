package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3233  Related place/location two identification  an..25
 * Specification of a second related place/location by code.
 */
public class E3233 extends Element {

    public E3233() {
        this(null);
    }

    public E3233(String Content) {
        super("3233", "Related place/location two identification", "an..25", "Specification of a second related place/location by code.", "Use UN/ECE Recommendation No. 16: UNLOCODE.  If not applicable, use appropriate code set in combination with 1131/3055.");
        this.setContent(Content);
    }
}

