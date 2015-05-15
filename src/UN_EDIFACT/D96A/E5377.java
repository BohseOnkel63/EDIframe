package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5377  Price change indicator, coded  an..3
 * Indication of the type of price change for a line item (eg increased).
 */
public class E5377 extends Element {

    public E5377() {
        this(null);
    }

    public E5377(String Content) {
        super("5377", "Price change indicator, coded", "an..3", "Indication of the type of price change for a line item (eg increased).", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

