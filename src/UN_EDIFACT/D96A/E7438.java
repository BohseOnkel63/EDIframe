package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7438  Level two id.  an..17
 * The second facet of a sequencing mechanism used to position an item within an indexing structure.
 */
public class E7438 extends Element {

    public E7438() {
        this(null);
    }

    public E7438(String Content) {
        super("7438", "Level two id.", "an..17", "The second facet of a sequencing mechanism used to position an item within an indexing structure.", "");
        this.setContent(Content);
    }
}

