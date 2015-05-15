package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7294  Requirement or condition  an..35
 * Plain text identifying a specific requirement or condition.
 */
public class E7294 extends Element {

    public E7294() {
        this(null);
    }

    public E7294(String Content) {
        super("7294", "Requirement or condition", "an..35", "Plain text identifying a specific requirement or condition.", "");
        this.setContent(Content);
    }
}

