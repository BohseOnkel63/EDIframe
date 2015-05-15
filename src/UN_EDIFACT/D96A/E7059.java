package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7059  Property class, coded  an..3
 * Specification of the type of class.
 */
public class E7059 extends Element {

    public E7059() {
        this(null);
    }

    public E7059(String Content) {
        super("7059", "Property class, coded", "an..3", "Specification of the type of class.", "");
        this.setContent(Content);
    }
}

