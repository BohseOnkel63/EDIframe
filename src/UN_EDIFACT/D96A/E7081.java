package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7081  Item characteristic, coded  an..3
 * Code specifying the item characteristic being described.
 */
public class E7081 extends Element {

    public E7081() {
        this(null);
    }

    public E7081(String Content) {
        super("7081", "Item characteristic, coded", "an..3", "Code specifying the item characteristic being described.", "");
        this.setContent(Content);
    }
}

