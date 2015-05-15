package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5393  Price multiplier qualifier  an..3
 * Type of price multiplier.
 */
public class E5393 extends Element {

    public E5393() {
        this(null);
    }

    public E5393(String Content) {
        super("5393", "Price multiplier qualifier", "an..3", "Type of price multiplier.", "");
        this.setContent(Content);
    }
}

