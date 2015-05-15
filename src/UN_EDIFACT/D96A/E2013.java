package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 2013  Frequency, coded  an..3
 * Code specifying interval grouping of the delivery, production, etc. of the schedule.
 */
public class E2013 extends Element {

    public E2013() {
        this(null);
    }

    public E2013(String Content) {
        super("2013", "Frequency, coded", "an..3", "Code specifying interval grouping of the delivery, production, etc. of the schedule.", "");
        this.setContent(Content);
    }
}

