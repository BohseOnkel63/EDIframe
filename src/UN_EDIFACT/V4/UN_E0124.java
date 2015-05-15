package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0124  Message implementation guideline release number  an..3
 * Release number within the message implementation guideline version number.
 */
public class UN_E0124 extends Element {

    public UN_E0124() {
        this(null);
    }

    public UN_E0124(String Content) {
        super("0124", "Message implementation guideline release number", "an..3", "Release number within the message implementation guideline version number.");
        this.setContent(Content);
    }
}

