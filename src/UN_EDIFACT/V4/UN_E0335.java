package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0335  Report language, coded  an..3
 * Coded identification of language.
 */
public class UN_E0335 extends Element {

    public UN_E0335() {
        this(null);
    }

    public UN_E0335(String Content) {
        super("0335", "Report language, coded", "an..3", "Coded identification of language.");
        this.setContent(Content);
    }
}

