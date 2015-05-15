package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4493  Delivery requirements, coded  an..3
 * Indication of general instruction for delivery.
 */
public class E4493 extends Element {

    public E4493() {
        this(null);
    }

    public E4493(String Content) {
        super("4493", "Delivery requirements, coded", "an..3", "Indication of general instruction for delivery.", "");
        this.setContent(Content);
    }
}

