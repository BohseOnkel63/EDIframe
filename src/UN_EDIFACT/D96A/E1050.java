package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1050  Sequence number  an..6
 * Number indicating the position in a sequence.
 */
public class E1050 extends Element {

    public E1050() {
        this(null);
    }

    public E1050(String Content) {
        super("1050", "Sequence number", "an..6", "Number indicating the position in a sequence.", "");
        this.setContent(Content);
    }
}

