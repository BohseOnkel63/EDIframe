package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7512  Structure component identifier  an..35
 * The identifier of a structure component.
 */
public class E7512 extends Element {

    public E7512() {
        this(null);
    }

    public E7512(String Content) {
        super("7512", "Structure component identifier", "an..35", "The identifier of a structure component.", "");
        this.setContent(Content);
    }
}

