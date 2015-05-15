package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6428  Actual stage count  n..2
 * Count of the actual number of stages agreed in a process.
 */
public class E6428 extends Element {

    public E6428() {
        this(null);
    }

    public E6428(String Content) {
        super("6428", "Actual stage count", "n..2", "Count of the actual number of stages agreed in a process.", "");
        this.setContent(Content);
    }
}

