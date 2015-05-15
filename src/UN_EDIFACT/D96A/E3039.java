package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3039  Party id. identification  an..35
 * Code identifying a party involved in a transaction.
 */
public class E3039 extends Element {

    public E3039() {
        this(null);
    }

    public E3039(String Content) {
        super("3039", "Party id. identification", "an..35", "Code identifying a party involved in a transaction.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

