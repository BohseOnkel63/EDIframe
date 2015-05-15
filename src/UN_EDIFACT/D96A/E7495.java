package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7495  Identification qualifier  an..3
 * To identify a type of object.
 */
public class E7495 extends Element {

    public E7495() {
        this(null);
    }

    public E7495(String Content) {
        super("7495", "Identification qualifier", "an..3", "To identify a type of object.", "");
        this.setContent(Content);
    }
}

