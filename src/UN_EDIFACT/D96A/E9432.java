package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9432  Footnote identifier  an..35
 * The identifier of a footnote.
 */
public class E9432 extends Element {

    public E9432() {
        this(null);
    }

    public E9432(String Content) {
        super("9432", "Footnote identifier", "an..35", "The identifier of a footnote.", "");
        this.setContent(Content);
    }
}

