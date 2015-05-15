package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3446  Party tax identification number  an..20
 * Number assigned to a purchaser (buyer, orderer) by a tax jurisdiction (state, country, etc).
 */
public class E3446 extends Element {

    public E3446() {
        this(null);
    }

    public E3446(String Content) {
        super("3446", "Party tax identification number", "an..20", "Number assigned to a purchaser (buyer, orderer) by a tax jurisdiction (state, country, etc).", "");
        this.setContent(Content);
    }
}

