package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 2379  Date/time/period format qualifier  an..3
 * Specification of the representation of a date, a date and time or of a period.
 */
public class E2379 extends Element {

    public E2379() {
        this(null);
    }

    public E2379(String Content) {
        super("2379", "Date/time/period format qualifier", "an..3", "Specification of the representation of a date, a date and time or of a period.", "");
        this.setContent(Content);
    }
}

