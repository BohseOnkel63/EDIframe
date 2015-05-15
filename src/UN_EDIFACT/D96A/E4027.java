package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4027  Business function qualifier  an..3
 * Specification of the type of business function.
 */
public class E4027 extends Element {

    public E4027() {
        this(null);
    }

    public E4027(String Content) {
        super("4027", "Business function qualifier", "an..3", "Specification of the type of business function.", "");
        this.setContent(Content);
    }
}

