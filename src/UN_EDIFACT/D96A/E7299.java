package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7299  Requirement designator, coded  an..3
 * To specify the designated requirement.
 */
public class E7299 extends Element {

    public E7299() {
        this(null);
    }

    public E7299(String Content) {
        super("7299", "Requirement designator, coded", "an..3", "To specify the designated requirement.", "");
        this.setContent(Content);
    }
}

