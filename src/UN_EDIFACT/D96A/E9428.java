package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9428  Array structure identifier  an..35
 * The identifier of an array structure.
 */
public class E9428 extends Element {

    public E9428() {
        this(null);
    }

    public E9428(String Content) {
        super("9428", "Array structure identifier", "an..35", "The identifier of an array structure.", "");
        this.setContent(Content);
    }
}

