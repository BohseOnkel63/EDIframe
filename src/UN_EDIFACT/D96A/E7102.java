package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7102  Shipping marks  an..35
 * Marks and numbers identifying individual packages.
 */
public class E7102 extends Element {

    public E7102() {
        this(null);
    }

    public E7102(String Content) {
        super("7102", "Shipping marks", "an..35", "Marks and numbers identifying individual packages.", "");
        this.setContent(Content);
    }
}

