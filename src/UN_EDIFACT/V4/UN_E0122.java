package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0122  Message implementation guideline version number  an..3
 * Version number of the message implementation guideline.
 */
public class UN_E0122 extends Element {

    public UN_E0122() {
        this(null);
    }

    public UN_E0122(String Content) {
        super("0122", "Message implementation guideline version number", "an..3", "Version number of the message implementation guideline.");
        this.setContent(Content);
    }
}

