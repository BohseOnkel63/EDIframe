package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7143  Item number type, coded  an..3
 * Identification of the type of item number.
 */
public class E7143 extends Element {

    public E7143() {
        this(null);
    }

    public E7143(String Content) {
        super("7143", "Item number type, coded", "an..3", "Identification of the type of item number.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

