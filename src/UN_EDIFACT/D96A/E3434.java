package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3434  Institution branch number  an..17
 * Number identifying a branch of an institution.
 */
public class E3434 extends Element {

    public E3434() {
        this(null);
    }

    public E3434(String Content) {
        super("3434", "Institution branch number", "an..17", "Number identifying a branch of an institution.", "");
        this.setContent(Content);
    }
}

