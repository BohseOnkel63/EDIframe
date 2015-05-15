package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4219  Transport priority, coded  an..3
 * Coded priority of requested transport service.
 */
public class E4219 extends Element {

    public E4219() {
        this(null);
    }

    public E4219(String Content) {
        super("4219", "Transport priority, coded", "an..3", "Coded priority of requested transport service.", "");
        this.setContent(Content);
    }
}

