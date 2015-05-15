package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 2475  Payment time reference, coded  an..3
 * Code relating payment terms to the date of a specific event.
 */
public class E2475 extends Element {

    public E2475() {
        this(null);
    }

    public E2475(String Content) {
        super("2475", "Payment time reference, coded", "an..3", "Code relating payment terms to the date of a specific event.", "");
        this.setContent(Content);
    }
}

