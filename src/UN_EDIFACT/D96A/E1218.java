package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1218  Number of originals of document required  n..2
 * Specification of the number of originals of a stipulated document that are required.
 */
public class E1218 extends Element {

    public E1218() {
        this(null);
    }

    public E1218(String Content) {
        super("1218", "Number of originals of document required", "n..2", "Specification of the number of originals of a stipulated document that are required.", "");
        this.setContent(Content);
    }
}

