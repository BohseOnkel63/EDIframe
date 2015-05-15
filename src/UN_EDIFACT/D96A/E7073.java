package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7073  Packaging terms and conditions, coded  an..3
 * Code identifying packaging terms and conditions.
 */
public class E7073 extends Element {

    public E7073() {
        this(null);
    }

    public E7073(String Content) {
        super("7073", "Packaging terms and conditions, coded", "an..3", "Code identifying packaging terms and conditions.", "");
        this.setContent(Content);
    }
}

