package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9164  Group identification  an..4
 * To identify a group within a message type structure.
 */
public class E9164 extends Element {

    public E9164() {
        this(null);
    }

    public E9164(String Content) {
        super("9164", "Group identification", "an..4", "To identify a group within a message type structure.", "");
        this.setContent(Content);
    }
}

