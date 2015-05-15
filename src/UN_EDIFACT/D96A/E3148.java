package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3148  Communication number  an..512
 * The communication number.
 */
public class E3148 extends Element {

    public E3148() {
        this(null);
    }

    public E3148(String Content) {
        super("3148", "Communication number", "an..512", "The communication number.", "");
        this.setContent(Content);
    }
}

