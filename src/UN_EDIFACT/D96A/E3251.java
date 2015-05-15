package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3251  Postcode identification  an..9
 * Code defining postal zones or addresses.
 */
public class E3251 extends Element {

    public E3251() {
        this(null);
    }

    public E3251(String Content) {
        super("3251", "Postcode identification", "an..9", "Code defining postal zones or addresses.", "Use code defined by appropriate national authority.");
        this.setContent(Content);
    }
}

