package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1220  Number of copies of document required  n..2
 * Number of originals or copies of a document stipulated or referred to as being required.
 */
public class E1220 extends Element {

    public E1220() {
        this(null);
    }

    public E1220(String Content) {
        super("1220", "Number of copies of document required", "n..2", "Number of originals or copies of a document stipulated or referred to as being required.", "");
        this.setContent(Content);
    }
}

