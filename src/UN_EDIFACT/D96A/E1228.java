package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1228  Action request/notification  an..35
 * Plain text specifying action taken or to be taken.
 */
public class E1228 extends Element {

    public E1228() {
        this(null);
    }

    public E1228(String Content) {
        super("1228", "Action request/notification", "an..35", "Plain text specifying action taken or to be taken.", "");
        this.setContent(Content);
    }
}

