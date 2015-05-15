package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1000  Document/message name  an..35
 * Plain language identifier specifying the function of a document/message.
 */
public class E1000 extends Element {

    public E1000() {
        this(null);
    }

    public E1000(String Content) {
        super("1000", "Document/message name", "an..35", "Plain language identifier specifying the function of a document/message.", "");
        this.setContent(Content);
    }
}

