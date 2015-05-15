package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5305  Duty/tax/fee category, coded  an..3
 * Code identifying a tax/duty/fee category within a tax/duty/fee type system.
 */
public class E5305 extends Element {

    public E5305() {
        this(null);
    }

    public E5305(String Content) {
        super("5305", "Duty/tax/fee category, coded", "an..3", "Code identifying a tax/duty/fee category within a tax/duty/fee type system.", "");
        this.setContent(Content);
    }
}

