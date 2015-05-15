package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1523  Association assigned identification  an..6
 * An association assigned code to further identify implementation of a message.
 */
public class E1523 extends Element {

    public E1523() {
        this(null);
    }

    public E1523(String Content) {
        super("1523", "Association assigned identification", "an..6", "An association assigned code to further identify implementation of a message.", "");
        this.setContent(Content);
    }
}

