package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4495  Insurance cover identification  an..17
 * Coded identification of the insurance cover.
 */
public class E4495 extends Element {

    public E4495() {
        this(null);
    }

    public E4495(String Content) {
        super("4495", "Insurance cover identification", "an..17", "Coded identification of the insurance cover.", "");
        this.setContent(Content);
    }
}

