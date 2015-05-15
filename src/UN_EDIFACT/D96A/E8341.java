package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8341  Haulage arrangements, coded  an..3
 * Specification of the type of equipment haulage arrangements.
 */
public class E8341 extends Element {

    public E8341() {
        this(null);
    }

    public E8341(String Content) {
        super("8341", "Haulage arrangements, coded", "an..3", "Specification of the type of equipment haulage arrangements.", "");
        this.setContent(Content);
    }
}

