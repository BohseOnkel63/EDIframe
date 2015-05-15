package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8092  Hazard code version number  an..10
 * The version/revision number of date of issuance of the code used.
 */
public class E8092 extends Element {

    public E8092() {
        this(null);
    }

    public E8092(String Content) {
        super("8092", "Hazard code version number", "an..10", "The version/revision number of date of issuance of the code used.", "");
        this.setContent(Content);
    }
}

