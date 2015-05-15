package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0344  Dialogue release number  an..3
 * Release number of a dialogue.
 */
public class UN_E0344 extends Element {

    public UN_E0344() {
        this(null);
    }

    public UN_E0344(String Content) {
        super("0344", "Dialogue release number", "an..3", "Release number of a dialogue.");
        this.setContent(Content);
    }
}

