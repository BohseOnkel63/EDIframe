package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4503  Inventory balance method, coded  an..3
 * To specify the method used to establish an inventory balance.
 */
public class E4503 extends Element {

    public E4503() {
        this(null);
    }

    public E4503(String Content) {
        super("4503", "Inventory balance method, coded", "an..3", "To specify the method used to establish an inventory balance.", "");
        this.setContent(Content);
    }
}

