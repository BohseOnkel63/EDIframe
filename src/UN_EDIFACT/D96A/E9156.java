package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9156  Simple data element maximum length  n..3
 * To indicate the maximum length of a simple data element.
 */
public class E9156 extends Element {

    public E9156() {
        this(null);
    }

    public E9156(String Content) {
        super("9156", "Simple data element maximum length", "n..3", "To indicate the maximum length of a simple data element.", "");
        this.setContent(Content);
    }
}

