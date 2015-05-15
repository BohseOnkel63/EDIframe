package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0044  Application recipient identification  an..35
 * Name or coded identification of the application recipient (for example, a division, branch or computer system/process).
 */
public class UN_E0044 extends Element {

    public UN_E0044() {
        this(null);
    }

    public UN_E0044(String Content) {
        super("0044", "Application recipient identification", "an..35", "Name or coded identification of the application recipient (for example, a division, branch or computer system/process).");
        this.setContent(Content);
    }
}

