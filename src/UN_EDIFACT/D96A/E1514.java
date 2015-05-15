package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1514  Value list name  an..70
 * The name of a list of coded or non coded values.
 */
public class E1514 extends Element {

    public E1514() {
        this(null);
    }

    public E1514(String Content) {
        super("1514", "Value list name", "an..70", "The name of a list of coded or non coded values.", "");
        this.setContent(Content);
    }
}

