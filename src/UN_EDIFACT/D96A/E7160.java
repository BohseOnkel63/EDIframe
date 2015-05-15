package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7160  Special service  an..35
 * Description of a special service.
 */
public class E7160 extends Element {

    public E7160() {
        this(null);
    }

    public E7160(String Content) {
        super("7160", "Special service", "an..35", "Description of a special service.", "");
        this.setContent(Content);
    }
}

