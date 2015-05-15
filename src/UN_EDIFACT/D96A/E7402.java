package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7402  Identity number  an..35
 * A value given to an object for identification purposes.
 */
public class E7402 extends Element {

    public E7402() {
        this(null);
    }

    public E7402(String Content) {
        super("7402", "Identity number", "an..35", "A value given to an object for identification purposes.", "");
        this.setContent(Content);
    }
}

