package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4505  Credit cover request, coded  an..3
 * Request for a credit cover.
 */
public class E4505 extends Element {

    public E4505() {
        this(null);
    }

    public E4505(String Content) {
        super("4505", "Credit cover request, coded", "an..3", "Request for a credit cover.", "");
        this.setContent(Content);
    }
}

