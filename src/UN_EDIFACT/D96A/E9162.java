package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9162  Data element tag  an..4
 * Tag of a data element.
 */
public class E9162 extends Element {

    public E9162() {
        this(null);
    }

    public E9162(String Content) {
        super("9162", "Data element tag", "an..4", "Tag of a data element.", "");
        this.setContent(Content);
    }
}

