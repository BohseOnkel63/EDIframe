package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8275  Container/package status, coded  an..3
 * Code to identify whether goods of separate description or comprising separate consignments are contained in the same external packaging or to indicate that a container or similar unit load device is empty.
 */
public class E8275 extends Element {

    public E8275() {
        this(null);
    }

    public E8275(String Content) {
        super("8275", "Container/package status, coded", "an..3", "Code to identify whether goods of separate description or comprising separate consignments are contained in the same external packaging or to indicate that a container or similar unit load device is empty.", "");
        this.setContent(Content);
    }
}

