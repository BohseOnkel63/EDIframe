package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3286  Address component  an..70
 * To specify a component of an address.
 */
public class E3286 extends Element {

    public E3286() {
        this(null);
    }

    public E3286(String Content) {
        super("3286", "Address component", "an..70", "To specify a component of an address.", "");
        this.setContent(Content);
    }
}

