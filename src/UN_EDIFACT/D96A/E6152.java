package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6152  Range maximum  n..18
 * Maximum of a range.
 */
public class E6152 extends Element {

    public E6152() {
        this(null);
    }

    public E6152(String Content) {
        super("6152", "Range maximum", "n..18", "Maximum of a range.", "");
        this.setContent(Content);
    }
}

