package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5213  Sub-line price change, coded  an..3
 * Code indicating disposition of the price change of a sub-line item.
 */
public class E5213 extends Element {

    public E5213() {
        this(null);
    }

    public E5213(String Content) {
        super("5213", "Sub-line price change, coded", "an..3", "Code indicating disposition of the price change of a sub-line item.", "");
        this.setContent(Content);
    }
}

