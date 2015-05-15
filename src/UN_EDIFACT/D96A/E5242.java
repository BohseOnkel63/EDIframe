package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5242  Rate/tariff class  an..35
 * Description of applicable rate/tariff class.
 */
public class E5242 extends Element {

    public E5242() {
        this(null);
    }

    public E5242(String Content) {
        super("5242", "Rate/tariff class", "an..35", "Description of applicable rate/tariff class.", "");
        this.setContent(Content);
    }
}

