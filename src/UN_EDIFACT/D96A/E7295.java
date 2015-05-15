package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7295  Requirement/condition identification  an..17
 * Code identifying a specific rule, regulation or condition.
 */
public class E7295 extends Element {

    public E7295() {
        this(null);
    }

    public E7295(String Content) {
        super("7295", "Requirement/condition identification", "an..17", "Code identifying a specific rule, regulation or condition.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

