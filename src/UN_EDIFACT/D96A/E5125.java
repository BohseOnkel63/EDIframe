package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5125  Price qualifier  an..3
 * Identification of a type of price.
 */
public class E5125 extends Element {

    public E5125() {
        this(null);
    }

    public E5125(String Content) {
        super("5125", "Price qualifier", "an..3", "Identification of a type of price.", "Code set of 5387 may be used also.");
        this.setContent(Content);
    }
}

