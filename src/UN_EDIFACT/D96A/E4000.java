package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4000  Reference version number  an..35
 * To uniquely identify a reference by its revision number.
 */
public class E4000 extends Element {

    public E4000() {
        this(null);
    }

    public E4000(String Content) {
        super("4000", "Reference version number", "an..35", "To uniquely identify a reference by its revision number.", "");
        this.setContent(Content);
    }
}

