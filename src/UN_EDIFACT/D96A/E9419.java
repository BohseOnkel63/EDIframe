package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9419  Service layer, coded  an..3
 * Subdivision of a service by code.
 */
public class E9419 extends Element {

    public E9419() {
        this(null);
    }

    public E9419(String Content) {
        super("9419", "Service layer, coded", "an..3", "Subdivision of a service by code.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

