package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3493  Nationality qualifier  an..3
 * To qualify a nationality.
 */
public class E3493 extends Element {

    public E3493() {
        this(null);
    }

    public E3493(String Content) {
        super("3493", "Nationality qualifier", "an..3", "To qualify a nationality.", "");
        this.setContent(Content);
    }
}

