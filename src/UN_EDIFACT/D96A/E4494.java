package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4494  Insurance cover  an..35
 * Identification of the insurance cover.
 */
public class E4494 extends Element {

    public E4494() {
        this(null);
    }

    public E4494(String Content) {
        super("4494", "Insurance cover", "an..35", "Identification of the insurance cover.", "");
        this.setContent(Content);
    }
}

