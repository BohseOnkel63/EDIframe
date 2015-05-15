package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9017  Attribute function qualifier  an..3
 * Specification of the meaning of an attribute function.
 */
public class E9017 extends Element {

    public E9017() {
        this(null);
    }

    public E9017(String Content) {
        super("9017", "Attribute function qualifier", "an..3", "Specification of the meaning of an attribute function.", "");
        this.setContent(Content);
    }
}

