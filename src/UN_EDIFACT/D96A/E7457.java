package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7457  Membership level identification  an..9
 * Identification of a membership level.
 */
public class E7457 extends Element {

    public E7457() {
        this(null);
    }

    public E7457(String Content) {
        super("7457", "Membership level identification", "an..9", "Identification of a membership level.", "");
        this.setContent(Content);
    }
}

