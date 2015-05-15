package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7047  Sample direction, coded  an..3
 * Code specifying the direction in which the sample was taken.
 */
public class E7047 extends Element {

    public E7047() {
        this(null);
    }

    public E7047(String Content) {
        super("7047", "Sample direction, coded", "an..3", "Code specifying the direction in which the sample was taken.", "");
        this.setContent(Content);
    }
}

