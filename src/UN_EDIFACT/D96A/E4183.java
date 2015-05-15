package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4183  Special conditions, coded  an..3
 * Indication of a specific condition.
 */
public class E4183 extends Element {

    public E4183() {
        this(null);
    }

    public E4183(String Content) {
        super("4183", "Special conditions, coded", "an..3", "Indication of a specific condition.", "");
        this.setContent(Content);
    }
}

