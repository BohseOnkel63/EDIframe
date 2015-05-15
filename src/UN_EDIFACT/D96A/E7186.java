package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7186  Process type  an..35
 * Free form description of a process.
 */
public class E7186 extends Element {

    public E7186() {
        this(null);
    }

    public E7186(String Content) {
        super("7186", "Process type", "an..35", "Free form description of a process.", "");
        this.setContent(Content);
    }
}

