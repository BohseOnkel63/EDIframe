package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1520  Data set identifier  an..35
 * The identifier of a data set.
 */
public class E1520 extends Element {

    public E1520() {
        this(null);
    }

    public E1520(String Content) {
        super("1520", "Data set identifier", "an..35", "The identifier of a data set.", "");
        this.setContent(Content);
    }
}

