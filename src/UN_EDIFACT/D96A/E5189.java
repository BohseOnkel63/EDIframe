package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5189  Charge/allowance description, coded  an..3
 * Identification of a charge or allowance.
 */
public class E5189 extends Element {

    public E5189() {
        this(null);
    }

    public E5189(String Content) {
        super("5189", "Charge/allowance description, coded", "an..3", "Identification of a charge or allowance.", "");
        this.setContent(Content);
    }
}

