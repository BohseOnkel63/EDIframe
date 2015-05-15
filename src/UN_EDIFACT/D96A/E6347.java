package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6347  Currency details qualifier  an..3
 * Specification of the usage to which the currency relates.
 */
public class E6347 extends Element {

    public E6347() {
        this(null);
    }

    public E6347(String Content) {
        super("6347", "Currency details qualifier", "an..3", "Specification of the usage to which the currency relates.", "");
        this.setContent(Content);
    }
}

