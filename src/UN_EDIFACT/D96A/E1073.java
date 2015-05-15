package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1073  Document line indicator, coded  an..3
 * Code indicating if a document line is included or excluded for processing purposes.
 */
public class E1073 extends Element {

    public E1073() {
        this(null);
    }

    public E1073(String Content) {
        super("1073", "Document line indicator, coded", "an..3", "Code indicating if a document line is included or excluded for processing purposes.", "");
        this.setContent(Content);
    }
}

