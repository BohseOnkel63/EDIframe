package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1156  Line number  an..6
 * Number of the line in the document/message referenced in 1154 Reference number.
 */
public class E1156 extends Element {

    public E1156() {
        this(null);
    }

    public E1156(String Content) {
        super("1156", "Line number", "an..6", "Number of the line in the document/message referenced in 1154 Reference number.", "");
        this.setContent(Content);
    }
}

