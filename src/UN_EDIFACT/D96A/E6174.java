package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6174  Size  n..15
 * A specified magnitude.
 */
public class E6174 extends Element {

    public E6174() {
        this(null);
    }

    public E6174(String Content) {
        super("6174", "Size", "n..15", "A specified magnitude.", "");
        this.setContent(Content);
    }
}

