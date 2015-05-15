package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5278  Duty/tax/fee rate  an..17
 * Rate of duty or tax or fee applicable to commodities or of tax applicable to services.
 */
public class E5278 extends Element {

    public E5278() {
        this(null);
    }

    public E5278(String Content) {
        super("5278", "Duty/tax/fee rate", "an..17", "Rate of duty or tax or fee applicable to commodities or of tax applicable to services.", "");
        this.setContent(Content);
    }
}

