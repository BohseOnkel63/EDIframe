package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7166  Hierarchical parent id.  an..12
 * Identification number of the next higher hierarchical data segment in a hierarchical structure.
 */
public class E7166 extends Element {

    public E7166() {
        this(null);
    }

    public E7166(String Content) {
        super("7166", "Hierarchical parent id.", "an..12", "Identification number of the next higher hierarchical data segment in a hierarchical structure.", "");
        this.setContent(Content);
    }
}

