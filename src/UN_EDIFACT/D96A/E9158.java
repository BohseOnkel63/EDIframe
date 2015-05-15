package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9158  Simple data element minimum length  n..3
 * To indicate the minimum length of a simple data element.
 */
public class E9158 extends Element {

    public E9158() {
        this(null);
    }

    public E9158(String Content) {
        super("9158", "Simple data element minimum length", "n..3", "To indicate the minimum length of a simple data element.", "");
        this.setContent(Content);
    }
}

