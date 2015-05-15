package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3036  Party name  an..35
 * Name of a party involved in a transaction.
 */
public class E3036 extends Element {

    public E3036() {
        this(null);
    }

    public E3036(String Content) {
        super("3036", "Party name", "an..35", "Name of a party involved in a transaction.", "");
        this.setContent(Content);
    }
}

