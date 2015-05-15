package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3475  Address status, coded  an..3
 * To specify the status of the address.
 */
public class E3475 extends Element {

    public E3475() {
        this(null);
    }

    public E3475(String Content) {
        super("3475", "Address status, coded", "an..3", "To specify the status of the address.", "");
        this.setContent(Content);
    }
}

