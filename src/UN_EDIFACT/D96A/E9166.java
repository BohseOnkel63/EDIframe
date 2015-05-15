package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9166  Segment tag  an..3
 * Tag of a segment.
 */
public class E9166 extends Element {

    public E9166() {
        this(null);
    }

    public E9166(String Content) {
        super("9166", "Segment tag", "an..3", "Tag of a segment.", "");
        this.setContent(Content);
    }
}

