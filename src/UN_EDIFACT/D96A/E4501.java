package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4501  Inventory movement direction, coded  an..3
 * To specify the direction of inventory movement.
 */
public class E4501 extends Element {

    public E4501() {
        this(null);
    }

    public E4501(String Content) {
        super("4501", "Inventory movement direction, coded", "an..3", "To specify the direction of inventory movement.", "");
        this.setContent(Content);
    }
}

