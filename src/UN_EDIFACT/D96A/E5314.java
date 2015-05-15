package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 5314  Remuneration type  an..35
 * Name of remuneration type as free text.
 */
public class E5314 extends Element {

    public E5314() {
        this(null);
    }

    public E5314(String Content) {
        super("5314", "Remuneration type", "an..35", "Name of remuneration type as free text.", "");
        this.setContent(Content);
    }
}

