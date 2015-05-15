package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3432  Institution name  an..70
 * Name of an institution.
 */
public class E3432 extends Element {

    public E3432() {
        this(null);
    }

    public E3432(String Content) {
        super("3432", "Institution name", "an..70", "Name of an institution.", "");
        this.setContent(Content);
    }
}

