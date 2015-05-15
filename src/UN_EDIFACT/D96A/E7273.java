package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7273  Service requirement, coded  an..3
 * Identification of a service requirement (which may constitute an additional component to a basic contract).
 */
public class E7273 extends Element {

    public E7273() {
        this(null);
    }

    public E7273(String Content) {
        super("7273", "Service requirement, coded", "an..3", "Identification of a service requirement (which may constitute an additional component to a basic contract).", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

