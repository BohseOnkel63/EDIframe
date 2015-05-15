package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0080  Service code list directory version number  an..6
 * Version number of the service code list directory.
 */
public class UN_E0080 extends Element {

    public UN_E0080() {
        this(null);
    }

    public UN_E0080(String Content) {
        super("0080", "Service code list directory version number", "an..6", "Version number of the service code list directory.");
        this.setContent(Content);
    }
}

