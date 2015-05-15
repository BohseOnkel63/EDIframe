package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4416  Test description  an..70
 * Free form description of the test method and procedure.
 */
public class E4416 extends Element {

    public E4416() {
        this(null);
    }

    public E4416(String Content) {
        super("4416", "Test description", "an..70", "Free form description of the test method and procedure.", "");
        this.setContent(Content);
    }
}

