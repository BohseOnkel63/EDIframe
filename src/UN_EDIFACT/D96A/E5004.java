package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5004  Monetary amount  n..18
 * Number of monetary units.
 */
public class E5004 extends Element {

    public E5004() {
        this(null);
    }

    public E5004(String Content) {
        super("5004", "Monetary amount", "n..18", "Number of monetary units.", "");
        this.setContent(Content);
    }
}

