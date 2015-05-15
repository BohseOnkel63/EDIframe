package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6145  Dimension qualifier  an..3
 * To specify the dimensions applicable to each of the transportable units.
 */
public class E6145 extends Element {

    public E6145() {
        this(null);
    }

    public E6145(String Content) {
        super("6145", "Dimension qualifier", "an..3", "To specify the dimensions applicable to each of the transportable units.", "");
        this.setContent(Content);
    }
}

