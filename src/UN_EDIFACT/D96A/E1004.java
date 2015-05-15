package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1004  Document/message number  an..35
 * Reference number assigned to the document/message by the issuer.
 */
public class E1004 extends Element {

    public E1004() {
        this(null);
    }

    public E1004(String Content) {
        super("1004", "Document/message number", "an..35", "Reference number assigned to the document/message by the issuer.", "");
        this.setContent(Content);
    }
}

