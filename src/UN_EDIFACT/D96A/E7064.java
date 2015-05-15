package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7064  Type of packages  an..35
 * Description of the form in which goods are presented.
 */
public class E7064 extends Element {

    public E7064() {
        this(null);
    }

    public E7064(String Content) {
        super("7064", "Type of packages", "an..35", "Description of the form in which goods are presented.", "");
        this.setContent(Content);
    }
}

