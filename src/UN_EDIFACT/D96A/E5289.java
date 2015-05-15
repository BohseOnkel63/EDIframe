package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5289  Duty/tax/fee account identification  an..6
 * Identification of a particular duty, tax or fee.
 */
public class E5289 extends Element {

    public E5289() {
        this(null);
    }

    public E5289(String Content) {
        super("5289", "Duty/tax/fee account identification", "an..6", "Identification of a particular duty, tax or fee.", "See national code sets.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

