package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5152  Duty/tax/fee type  an..35
 * Type of duty or tax or fee applicable to commodities or of tax applicable to services.
 */
public class E5152 extends Element {

    public E5152() {
        this(null);
    }

    public E5152(String Content) {
        super("5152", "Duty/tax/fee type", "an..35", "Type of duty or tax or fee applicable to commodities or of tax applicable to services.", "");
        this.setContent(Content);
    }
}

