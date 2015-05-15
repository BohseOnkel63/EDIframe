package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9142  Relationship  an..35
 * Description of a relationship.
 */
public class E9142 extends Element {

    public E9142() {
        this(null);
    }

    public E9142(String Content) {
        super("9142", "Relationship", "an..35", "Description of a relationship.", "");
        this.setContent(Content);
    }
}

