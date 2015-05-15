package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 2380  Date/time/period  an..35
 * The value of a date, a date and time, a time or of a period in a specified representation.
 */
public class E2380 extends Element {

    public E2380() {
        this(null);
    }

    public E2380(String Content) {
        super("2380", "Date/time/period", "an..35", "The value of a date, a date and time, a time or of a period in a specified representation.", "");
        this.setContent(Content);
    }
}

