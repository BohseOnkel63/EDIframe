package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9141  Relationship qualifier  an..3
 * Specification of the meaning of a relationship.
 */
public class E9141 extends Element {

    public E9141() {
        this(null);
    }

    public E9141(String Content) {
        super("9141", "Relationship qualifier", "an..3", "Specification of the meaning of a relationship.", "");
        this.setContent(Content);
    }
}

