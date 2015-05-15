package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7008  Item description  an..35
 * Plain language description of articles or products.
 */
public class E7008 extends Element {

    public E7008() {
        this(null);
    }

    public E7008(String Content) {
        super("7008", "Item description", "an..35", "Plain language description of articles or products.", "");
        this.setContent(Content);
    }
}

