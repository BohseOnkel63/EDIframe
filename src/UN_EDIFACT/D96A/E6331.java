package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6331  Statistic type, coded  an..3
 * Specification of the specific statistic being reported.
 */
public class E6331 extends Element {

    public E6331() {
        this(null);
    }

    public E6331(String Content) {
        super("6331", "Statistic type, coded", "an..3", "Specification of the specific statistic being reported.", "");
        this.setContent(Content);
    }
}

