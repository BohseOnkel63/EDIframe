package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3055  Code list responsible agency, coded  an..3
 * Code identifying the agency responsible for a code list.
 */
public class E3055 extends Element {

    public E3055() {
        this(null);
    }

    public E3055(String Content) {
        super("3055", "Code list responsible agency, coded", "an..3", "Code identifying the agency responsible for a code list.", "");
        this.setContent(Content);
    }
}

