package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8332  Equipment plan  an..26
 * Description indicating equipment plan, e.g. FCL or LCL.
 */
public class E8332 extends Element {

    public E8332() {
        this(null);
    }

    public E8332(String Content) {
        super("8332", "Equipment plan", "an..26", "Description indicating equipment plan, e.g. FCL or LCL.", "");
        this.setContent(Content);
    }
}

