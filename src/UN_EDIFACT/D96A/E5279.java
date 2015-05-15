package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5279  Duty/tax/fee rate identification  an..7
 * Identification of the rate of duty or tax or fee applicable to commodities or of tax applicable to services.
 */
public class E5279 extends Element {

    public E5279() {
        this(null);
    }

    public E5279(String Content) {
        super("5279", "Duty/tax/fee rate identification", "an..7", "Identification of the rate of duty or tax or fee applicable to commodities or of tax applicable to services.", "See national code sets.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

