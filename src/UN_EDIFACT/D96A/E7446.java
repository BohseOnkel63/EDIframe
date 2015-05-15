package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7446  Level six id.  an..17
 * The sixth facet of a sequencing mechanism used to position an item within an indexing structure.
 */
public class E7446 extends Element {

    public E7446() {
        this(null);
    }

    public E7446(String Content) {
        super("7446", "Level six id.", "an..17", "The sixth facet of a sequencing mechanism used to position an item within an indexing structure.", "");
        this.setContent(Content);
    }
}

