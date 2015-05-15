package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1503  Data format, coded  an..3
 * A code to identify the data format.
 */
public class E1503 extends Element {

    public E1503() {
        this(null);
    }

    public E1503(String Content) {
        super("1503", "Data format, coded", "an..3", "A code to identify the data format.", "");
        this.setContent(Content);
    }
}

