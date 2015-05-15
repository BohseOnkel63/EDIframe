package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1511  Computer environment, coded  an..3
 * A code to identify the computer environment.
 */
public class E1511 extends Element {

    public E1511() {
        this(null);
    }

    public E1511(String Content) {
        super("1511", "Computer environment, coded", "an..3", "A code to identify the computer environment.", "");
        this.setContent(Content);
    }
}

