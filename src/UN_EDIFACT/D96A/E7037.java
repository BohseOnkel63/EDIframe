package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7037  Characteristic identification  an..17
 * A code from an industry code list which provides specific data about a product characteristic.
 */
public class E7037 extends Element {

    public E7037() {
        this(null);
    }

    public E7037(String Content) {
        super("7037", "Characteristic identification", "an..17", "A code from an industry code list which provides specific data about a product characteristic.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

