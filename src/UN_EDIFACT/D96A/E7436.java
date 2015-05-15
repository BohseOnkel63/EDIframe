package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7436  Level one id.  an..17
 * The first facet of a sequencing mechanism used to position an item within an indexing structure.
 */
public class E7436 extends Element {

    public E7436() {
        this(null);
    }

    public E7436(String Content) {
        super("7436", "Level one id.", "an..17", "The first facet of a sequencing mechanism used to position an item within an indexing structure.", "");
        this.setContent(Content);
    }
}

