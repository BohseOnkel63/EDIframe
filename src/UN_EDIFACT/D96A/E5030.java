package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5030  Index value  n..6
 * To specify the value of an index.
 */
public class E5030 extends Element {

    public E5030() {
        this(null);
    }

    public E5030(String Content) {
        super("5030", "Index value", "n..6", "To specify the value of an index.", "");
        this.setContent(Content);
    }
}

