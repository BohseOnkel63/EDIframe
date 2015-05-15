package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7442  Level four id.  an..17
 * The fourth facet of a sequencing mechanism used to position an item within an indexing structure.
 */
public class E7442 extends Element {

    public E7442() {
        this(null);
    }

    public E7442(String Content) {
        super("7442", "Level four id.", "an..17", "The fourth facet of a sequencing mechanism used to position an item within an indexing structure.", "");
        this.setContent(Content);
    }
}

