package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5153  Duty/tax/fee type, coded  an..3
 * Identification of the type of duty or tax or fee applicable to commodities or of tax applicable to services.
 */
public class E5153 extends Element {

    public E5153() {
        this(null);
    }

    public E5153(String Content) {
        super("5153", "Duty/tax/fee type, coded", "an..3", "Identification of the type of duty or tax or fee applicable to commodities or of tax applicable to services.", "If national codes needed, use in combination with 1131/3055.");
        this.setContent(Content);
    }
}

