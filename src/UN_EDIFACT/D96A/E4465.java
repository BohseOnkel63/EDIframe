package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4465  Adjustment reason, coded  an..3
 * Indication of reason for adjustment.
 */
public class E4465 extends Element {

    public E4465() {
        this(null);
    }

    public E4465(String Content) {
        super("4465", "Adjustment reason, coded", "an..3", "Indication of reason for adjustment.", "");
        this.setContent(Content);
    }
}

