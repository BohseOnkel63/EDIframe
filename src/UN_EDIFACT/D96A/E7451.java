package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7451  Membership category identification  an..4
 * Identification of a membership category.
 */
public class E7451 extends Element {

    public E7451() {
        this(null);
    }

    public E7451(String Content) {
        super("7451", "Membership category identification", "an..4", "Identification of a membership category.", "");
        this.setContent(Content);
    }
}

