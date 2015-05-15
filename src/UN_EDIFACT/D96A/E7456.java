package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7456  Membership level  an..35
 * Description of a membership level.
 */
public class E7456 extends Element {

    public E7456() {
        this(null);
    }

    public E7456(String Content) {
        super("7456", "Membership level", "an..35", "Description of a membership level.", "");
        this.setContent(Content);
    }
}

