package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7187  Process type identification  an..17
 * Specification of a process or subprocess.
 */
public class E7187 extends Element {

    public E7187() {
        this(null);
    }

    public E7187(String Content) {
        super("7187", "Process type identification", "an..17", "Specification of a process or subprocess.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

