package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4455  Back order, coded  an..3
 * Code to identify the back order agreement.
 */
public class E4455 extends Element {

    public E4455() {
        this(null);
    }

    public E4455(String Content) {
        super("4455", "Back order, coded", "an..3", "Code to identify the back order agreement.", "");
        this.setContent(Content);
    }
}

