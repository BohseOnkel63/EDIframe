package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9153  Simple data element character representation, coded  an..3
 * To specify the character representation of a simple data element.
 */
public class E9153 extends Element {

    public E9153() {
        this(null);
    }

    public E9153(String Content) {
        super("9153", "Simple data element character representation, coded", "an..3", "To specify the character representation of a simple data element.", "");
        this.setContent(Content);
    }
}

