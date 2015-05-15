package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9282  Validation key identification  an..35
 * Identifies the cryptographic key used to calculate the validation result.
 */
public class E9282 extends Element {

    public E9282() {
        this(null);
    }

    public E9282(String Content) {
        super("9282", "Validation key identification", "an..35", "Identifies the cryptographic key used to calculate the validation result.", "");
        this.setContent(Content);
    }
}

