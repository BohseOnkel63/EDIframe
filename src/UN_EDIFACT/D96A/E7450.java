package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7450  Membership category  an..35
 * Description of a membership category.
 */
public class E7450 extends Element {

    public E7450() {
        this(null);
    }

    public E7450(String Content) {
        super("7450", "Membership category", "an..35", "Description of a membership category.", "");
        this.setContent(Content);
    }
}

