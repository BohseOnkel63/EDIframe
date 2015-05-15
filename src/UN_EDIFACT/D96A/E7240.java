package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7240  Total number of items  n..15
 * Total number of items, having separate goods descriptions.
 */
public class E7240 extends Element {

    public E7240() {
        this(null);
    }

    public E7240(String Content) {
        super("7240", "Total number of items", "n..15", "Total number of items, having separate goods descriptions.", "");
        this.setContent(Content);
    }
}

