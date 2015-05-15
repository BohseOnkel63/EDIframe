package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5479  Relation, coded  an..3
 * To specify the relationship between two or more items.
 */
public class E5479 extends Element {

    public E5479() {
        this(null);
    }

    public E5479(String Content) {
        super("5479", "Relation, coded", "an..3", "To specify the relationship between two or more items.", "Code values to be provided.");
        this.setContent(Content);
    }
}

