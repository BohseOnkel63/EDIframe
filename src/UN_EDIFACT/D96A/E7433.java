package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7433  Agreement type, coded  an..3
 * Specification of the type of agreement.
 */
public class E7433 extends Element {

    public E7433() {
        this(null);
    }

    public E7433(String Content) {
        super("7433", "Agreement type, coded", "an..3", "Specification of the type of agreement.", "");
        this.setContent(Content);
    }
}

