package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7188  Test revision number  an..30
 * Definition of the revision or of the change level of the specified test method employed.
 */
public class E7188 extends Element {

    public E7188() {
        this(null);
    }

    public E7188(String Content) {
        super("7188", "Test revision number", "an..30", "Definition of the revision or of the change level of the specified test method employed.", "");
        this.setContent(Content);
    }
}

