package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5394  Price multiplier  n..12
 * Rate to be used to multiply a price.
 */
public class E5394 extends Element {

    public E5394() {
        this(null);
    }

    public E5394(String Content) {
        super("5394", "Price multiplier", "n..12", "Rate to be used to multiply a price.", "");
        this.setContent(Content);
    }
}

