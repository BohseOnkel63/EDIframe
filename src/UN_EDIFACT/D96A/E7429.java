package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7429  Indexing structure qualifier  an..3
 * To qualify the indexing structure established for a project.
 */
public class E7429 extends Element {

    public E7429() {
        this(null);
    }

    public E7429(String Content) {
        super("7429", "Indexing structure qualifier", "an..3", "To qualify the indexing structure established for a project.", "");
        this.setContent(Content);
    }
}

