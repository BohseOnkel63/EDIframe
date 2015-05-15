package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1001  Document/message name, coded  an..3
 * Document/message identifier expressed in code.
 */
public class E1001 extends Element {

    public E1001() {
        this(null);
    }

    public E1001(String Content) {
        super("1001", "Document/message name, coded", "an..3", "Document/message identifier expressed in code.", "Users should note that code values marked as additions or changes are included pending approval by the 1001 Maintenance Agency and may be disapproved or changed. The results of this review will be reflected in a future version of the draft directory.");
        this.setContent(Content);
    }
}

