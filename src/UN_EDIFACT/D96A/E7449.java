package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7449  Membership qualifier  an..3
 * Specification of the meaning of a code to qualify membership data.
 */
public class E7449 extends Element {

    public E7449() {
        this(null);
    }

    public E7449(String Content) {
        super("7449", "Membership qualifier", "an..3", "Specification of the meaning of a code to qualify membership data.", "");
        this.setContent(Content);
    }
}

