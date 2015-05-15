package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4499  Reason for inventory movement, coded  an..3
 * To explain the reason for the inventory movement.
 */
public class E4499 extends Element {

    public E4499() {
        this(null);
    }

    public E4499(String Content) {
        super("4499", "Reason for inventory movement, coded", "an..3", "To explain the reason for the inventory movement.", "");
        this.setContent(Content);
    }
}

