package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7039  Sample selection method, coded  an..3
 * Code denoting the method of selecting the test specimen.
 */
public class E7039 extends Element {

    public E7039() {
        this(null);
    }

    public E7039(String Content) {
        super("7039", "Sample selection method, coded", "an..3", "Code denoting the method of selecting the test specimen.", "");
        this.setContent(Content);
    }
}

