package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4294  Change reason  an..35
 * Description of the reason for a change.
 */
public class E4294 extends Element {

    public E4294() {
        this(null);
    }

    public E4294(String Content) {
        super("4294", "Change reason", "an..35", "Description of the reason for a change.", "");
        this.setContent(Content);
    }
}

