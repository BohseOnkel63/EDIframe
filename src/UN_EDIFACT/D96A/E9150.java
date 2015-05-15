package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9150  Simple data element tag  an..4
 * Tag of a simple data element.
 */
public class E9150 extends Element {

    public E9150() {
        this(null);
    }

    public E9150(String Content) {
        super("9150", "Simple data element tag", "an..4", "Tag of a simple data element.", "");
        this.setContent(Content);
    }
}

