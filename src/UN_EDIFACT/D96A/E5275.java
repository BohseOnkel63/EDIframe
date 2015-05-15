package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5275  Supplementary rate/tariff basis identification  an..6
 * Code identifying supplementary rate/tariff.
 */
public class E5275 extends Element {

    public E5275() {
        this(null);
    }

    public E5275(String Content) {
        super("5275", "Supplementary rate/tariff basis identification", "an..6", "Code identifying supplementary rate/tariff.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

