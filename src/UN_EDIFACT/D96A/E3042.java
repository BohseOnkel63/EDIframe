package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3042  Street and number/p.o. box  an..35
 * Street and number in plain language, or Post Office Box No.
 */
public class E3042 extends Element {

    public E3042() {
        this(null);
    }

    public E3042(String Content) {
        super("3042", "Street and number/p.o. box", "an..35", "Street and number in plain language, or Post Office Box No.", "");
        this.setContent(Content);
    }
}

