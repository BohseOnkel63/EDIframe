package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1373  Document/message status, coded  an..3
 * To identify the status of a document/message.
 */
public class E1373 extends Element {

    public E1373() {
        this(null);
    }

    public E1373(String Content) {
        super("1373", "Document/message status, coded", "an..3", "To identify the status of a document/message.", "");
        this.setContent(Content);
    }
}

