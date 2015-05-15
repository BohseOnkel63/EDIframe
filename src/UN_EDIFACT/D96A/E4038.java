package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4038  Additional safety information  an..35
 * Element to enable additional safety information to be specified as free text.
 */
public class E4038 extends Element {

    public E4038() {
        this(null);
    }

    public E4038(String Content) {
        super("4038", "Additional safety information", "an..35", "Element to enable additional safety information to be specified as free text.", "");
        this.setContent(Content);
    }
}

