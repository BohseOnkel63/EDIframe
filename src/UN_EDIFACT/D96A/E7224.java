package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7224  Number of packages  n..8
 * Number of individual parts of a shipment either unpacked, or packed in such a way that they cannot be divided without first undoing the packing.
 */
public class E7224 extends Element {

    public E7224() {
        this(null);
    }

    public E7224(String Content) {
        super("7224", "Number of packages", "n..8", "Number of individual parts of a shipment either unpacked, or packed in such a way that they cannot be divided without first undoing the packing.", "");
        this.setContent(Content);
    }
}

