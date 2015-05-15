package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5237  Charge category, coded  an..3
 * To indicate the category or zone of charges.
 */
public class E5237 extends Element {

    public E5237() {
        this(null);
    }

    public E5237(String Content) {
        super("5237", "Charge category, coded", "an..3", "To indicate the category or zone of charges.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

