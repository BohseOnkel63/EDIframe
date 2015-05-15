package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5013  Index qualifier  an..3
 * To identify the type of index being referred to.
 */
public class E5013 extends Element {

    public E5013() {
        this(null);
    }

    public E5013(String Content) {
        super("5013", "Index qualifier", "an..3", "To identify the type of index being referred to.", "");
        this.setContent(Content);
    }
}

