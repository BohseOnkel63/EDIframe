package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1505  Value list type, coded  an..3
 * A code indicating the type of value list.
 */
public class E1505 extends Element {

    public E1505() {
        this(null);
    }

    public E1505(String Content) {
        super("1505", "Value list type, coded", "an..3", "A code indicating the type of value list.", "");
        this.setContent(Content);
    }
}

