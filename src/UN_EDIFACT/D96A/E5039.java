package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5039  Index value representation, coded  an..3
 * To identify the representation of an index value.
 */
public class E5039 extends Element {

    public E5039() {
        this(null);
    }

    public E5039(String Content) {
        super("5039", "Index value representation, coded", "an..3", "To identify the representation of an index value.", "");
        this.setContent(Content);
    }
}

