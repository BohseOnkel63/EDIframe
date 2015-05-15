package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8339  Packing group, coded  an..3
 * Identification of a packing group by code.
 */
public class E8339 extends Element {

    public E8339() {
        this(null);
    }

    public E8339(String Content) {
        super("8339", "Packing group, coded", "an..3", "Identification of a packing group by code.", "");
        this.setContent(Content);
    }
}

