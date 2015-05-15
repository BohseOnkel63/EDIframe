package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3285  Recipient of the instruction identification  an..17
 * Party to whom the instruction is directed for advice or action.
 */
public class E3285 extends Element {

    public E3285() {
        this(null);
    }

    public E3285(String Content) {
        super("3285", "Recipient of the instruction identification", "an..17", "Party to whom the instruction is directed for advice or action.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

