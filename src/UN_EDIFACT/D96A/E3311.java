package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3311  Person inherited characteristic identification  an..8
 * To specify a person inherited characteristic using a code value.
 */
public class E3311 extends Element {

    public E3311() {
        this(null);
    }

    public E3311(String Content) {
        super("3311", "Person inherited characteristic identification", "an..8", "To specify a person inherited characteristic using a code value.", "");
        this.setContent(Content);
    }
}

