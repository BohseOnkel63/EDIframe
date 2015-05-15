package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 2005  Date/time/period qualifier  an..3
 * Code giving specific meaning to a date, time or period.
 */
public class E2005 extends Element {

    public E2005() {
        this(null);
    }

    public E2005(String Content) {
        super("2005", "Date/time/period qualifier", "an..3", "Code giving specific meaning to a date, time or period.", "");
        this.setContent(Content);
    }
}

