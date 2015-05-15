package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4036  Priority  an..35
 * To indicate a priority.
 */
public class E4036 extends Element {

    public E4036() {
        this(null);
    }

    public E4036(String Content) {
        super("4036", "Priority", "an..35", "To indicate a priority.", "");
        this.setContent(Content);
    }
}

