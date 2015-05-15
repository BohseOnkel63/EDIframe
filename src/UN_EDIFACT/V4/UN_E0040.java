package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0040  Application sender identification  an..35
 * Name or coded identification of the application sender (for example, a division, branch or computer system/process).
 */
public class UN_E0040 extends Element {

    public UN_E0040() {
        this(null);
    }

    public UN_E0040(String Content) {
        super("0040", "Application sender identification", "an..35", "Name or coded identification of the application sender (for example, a division, branch or computer system/process).");
        this.setContent(Content);
    }
}

