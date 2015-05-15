package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7164  Hierarchical id. number  an..12
 * A unique number assigned by the sender to identify a level within a hierarchical structure.
 */
public class E7164 extends Element {

    public E7164() {
        this(null);
    }

    public E7164(String Content) {
        super("7164", "Hierarchical id. number", "an..12", "A unique number assigned by the sender to identify a level within a hierarchical structure.", "");
        this.setContent(Content);
    }
}

