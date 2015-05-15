package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6434  Statistical concept identifier  an..35
 * The identifier of a statistical concept.
 */
public class E6434 extends Element {

    public E6434() {
        this(null);
    }

    public E6434(String Content) {
        super("6434", "Statistical concept identifier", "an..35", "The identifier of a statistical concept.", "");
        this.setContent(Content);
    }
}

