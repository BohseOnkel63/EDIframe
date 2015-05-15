package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9021  Attribute type, coded  an..3
 * Coded specification of the type attribute.
 */
public class E9021 extends Element {

    public E9021() {
        this(null);
    }

    public E9021(String Content) {
        super("9021", "Attribute type, coded", "an..3", "Coded specification of the type attribute.", "Must be from an external code set, such as a user or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

