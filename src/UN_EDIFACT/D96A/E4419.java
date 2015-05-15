package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4419  Test route of administering, coded  an..3
 * Code specifying the method of administering the test, e.g. oral, inhalation.
 */
public class E4419 extends Element {

    public E4419() {
        this(null);
    }

    public E4419(String Content) {
        super("4419", "Test route of administering, coded", "an..3", "Code specifying the method of administering the test, e.g. oral, inhalation.", "");
        this.setContent(Content);
    }
}

