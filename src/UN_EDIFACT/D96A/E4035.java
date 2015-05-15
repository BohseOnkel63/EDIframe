package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4035  Priority qualifier  an..3
 * To indicate the type of a priority.
 */
public class E4035 extends Element {

    public E4035() {
        this(null);
    }

    public E4035(String Content) {
        super("4035", "Priority qualifier", "an..3", "To indicate the type of a priority.", "");
        this.setContent(Content);
    }
}

