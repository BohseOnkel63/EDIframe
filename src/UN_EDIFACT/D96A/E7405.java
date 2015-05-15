package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7405  Identity number qualifier  an..3
 * Code specifying the type/source of identity number.
 */
public class E7405 extends Element {

    public E7405() {
        this(null);
    }

    public E7405(String Content) {
        super("7405", "Identity number qualifier", "an..3", "Code specifying the type/source of identity number.", "");
        this.setContent(Content);
    }
}

