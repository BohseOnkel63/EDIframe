package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7140  Item number  an..35
 * A number allocated to a group or item.
 */
public class E7140 extends Element {

    public E7140() {
        this(null);
    }

    public E7140(String Content) {
        super("7140", "Item number", "an..35", "A number allocated to a group or item.", "");
        this.setContent(Content);
    }
}

