package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1475  Message type identifier  an..6
 * Code identifying a type of message as assigned by its controlling agency.
 */
public class E1475 extends Element {

    public E1475() {
        this(null);
    }

    public E1475(String Content) {
        super("1475", "Message type identifier", "an..6", "Code identifying a type of message as assigned by its controlling agency.", "");
        this.setContent(Content);
    }
}

