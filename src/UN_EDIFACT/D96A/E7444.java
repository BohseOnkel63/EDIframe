package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7444  Level five id.  an..17
 * The fifth facet of a sequencing mechanism used to position an item within an indexing structure.
 */
public class E7444 extends Element {

    public E7444() {
        this(null);
    }

    public E7444(String Content) {
        super("7444", "Level five id.", "an..17", "The fifth facet of a sequencing mechanism used to position an item within an indexing structure.", "");
        this.setContent(Content);
    }
}

