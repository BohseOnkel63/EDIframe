package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3225  Place/location identification  an..25
 * Identification of the name of place/location, other than 3164 City name.
 */
public class E3225 extends Element {

    public E3225() {
        this(null);
    }

    public E3225(String Content) {
        super("3225", "Place/location identification", "an..25", "Identification of the name of place/location, other than 3164 City name.", "Use UN/ECE Recommendation No. 16: UNLOCODE.  If not applicable, use appropriate code set in combination with 1131/3055.");
        this.setContent(Content);
    }
}

