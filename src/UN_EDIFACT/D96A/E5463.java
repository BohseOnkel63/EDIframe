package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5463  Allowance or charge qualifier  an..3
 * Specification of an allowance or charge for the service specified.
 */
public class E5463 extends Element {

    public E5463() {
        this(null);
    }

    public E5463(String Content) {
        super("5463", "Allowance or charge qualifier", "an..3", "Specification of an allowance or charge for the service specified.", "");
        this.setContent(Content);
    }
}

