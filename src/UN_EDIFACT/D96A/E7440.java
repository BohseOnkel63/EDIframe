package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7440  Level three id.  an..17
 * The third facet of a sequencing mechanism used to position an item within an indexing structure.
 */
public class E7440 extends Element {

    public E7440() {
        this(null);
    }

    public E7440(String Content) {
        super("7440", "Level three id.", "an..17", "The third facet of a sequencing mechanism used to position an item within an indexing structure.", "");
        this.setContent(Content);
    }
}

