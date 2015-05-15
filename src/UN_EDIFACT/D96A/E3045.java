package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3045  Party name format, coded  an..3
 * Specification of the representation of a party name.
 */
public class E3045 extends Element {

    public E3045() {
        this(null);
    }

    public E3045(String Content) {
        super("3045", "Party name format, coded", "an..3", "Specification of the representation of a party name.", "");
        this.setContent(Content);
    }
}

