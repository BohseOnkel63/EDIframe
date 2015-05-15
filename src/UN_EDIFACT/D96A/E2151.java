package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 2151  Type of period, coded  an..3
 * Agreed or specified period of time (coded).
 */
public class E2151 extends Element {

    public E2151() {
        this(null);
    }

    public E2151(String Content) {
        super("2151", "Type of period, coded", "an..3", "Agreed or specified period of time (coded).", "");
        this.setContent(Content);
    }
}

