package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5243  Rate/tariff class identification  an..9
 * Identification of the rate/tariff class.
 */
public class E5243 extends Element {

    public E5243() {
        this(null);
    }

    public E5243(String Content) {
        super("5243", "Rate/tariff class identification", "an..9", "Identification of the rate/tariff class.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

