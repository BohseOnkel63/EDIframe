package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4415  Test method identification  an..17
 * Code to specify the test method employed.
 */
public class E4415 extends Element {

    public E4415() {
        this(null);
    }

    public E4415(String Content) {
        super("4415", "Test method identification", "an..17", "Code to specify the test method employed.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

