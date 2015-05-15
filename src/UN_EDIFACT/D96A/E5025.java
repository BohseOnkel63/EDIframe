package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5025  Monetary amount type qualifier  an..3
 * Indication of type of amount.
 */
public class E5025 extends Element {

    public E5025() {
        this(null);
    }

    public E5025(String Content) {
        super("5025", "Monetary amount type qualifier", "an..3", "Indication of type of amount.", "");
        this.setContent(Content);
    }
}

