package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9434  Code name  an..70
 * Name of a code.
 */
public class E9434 extends Element {

    public E9434() {
        this(null);
    }

    public E9434(String Content) {
        super("9434", "Code name", "an..70", "Name of a code.", "");
        this.setContent(Content);
    }
}

