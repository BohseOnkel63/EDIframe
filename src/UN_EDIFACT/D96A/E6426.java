package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6426  Number of stages  n..2
 * Count of the number of stages that will be used in the process.
 */
public class E6426 extends Element {

    public E6426() {
        this(null);
    }

    public E6426(String Content) {
        super("6426", "Number of stages", "n..2", "Count of the number of stages that will be used in the process.", "");
        this.setContent(Content);
    }
}

