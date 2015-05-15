package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5286  Duty/tax/fee assessment basis  an..15
 * Value or quantity on which a duty or tax will be assessed.
 */
public class E5286 extends Element {

    public E5286() {
        this(null);
    }

    public E5286(String Content) {
        super("5286", "Duty/tax/fee assessment basis", "an..15", "Value or quantity on which a duty or tax will be assessed.", "");
        this.setContent(Content);
    }
}

