package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6350  Number of units  n..15
 * Number of units of a certain type.
 */
public class E6350 extends Element {

    public E6350() {
        this(null);
    }

    public E6350(String Content) {
        super("6350", "Number of units", "n..15", "Number of units of a certain type.", "");
        this.setContent(Content);
    }
}

