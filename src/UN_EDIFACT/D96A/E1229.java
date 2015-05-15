package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1229  Action request/notification, coded  an..3
 * Code specifying the action to be taken or already taken.
 */
public class E1229 extends Element {

    public E1229() {
        this(null);
    }

    public E1229(String Content) {
        super("1229", "Action request/notification, coded", "an..3", "Code specifying the action to be taken or already taken.", "");
        this.setContent(Content);
    }
}

