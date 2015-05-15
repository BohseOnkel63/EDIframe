package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9430  Footnote set identifier  an..35
 * The identifier of a set of footnotes.
 */
public class E9430 extends Element {

    public E9430() {
        this(null);
    }

    public E9430(String Content) {
        super("9430", "Footnote set identifier", "an..35", "The identifier of a set of footnotes.", "");
        this.setContent(Content);
    }
}

