package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1054  Message sub-item number  n..6
 * The reference number allocated to an identifiable sub-item in a message. eg: invoice line number.
 */
public class E1054 extends Element {

    public E1054() {
        this(null);
    }

    public E1054(String Content) {
        super("1054", "Message sub-item number", "n..6", "The reference number allocated to an identifiable sub-item in a message. eg: invoice line number.", "");
        this.setContent(Content);
    }
}

