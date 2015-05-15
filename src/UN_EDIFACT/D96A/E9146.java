package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9146  Composite data element tag  an..4
 * Tag of a composite data element.
 */
public class E9146 extends Element {

    public E9146() {
        this(null);
    }

    public E9146(String Content) {
        super("9146", "Composite data element tag", "an..4", "Tag of a composite data element.", "");
        this.setContent(Content);
    }
}

