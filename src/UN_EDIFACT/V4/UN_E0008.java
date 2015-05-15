package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0008  Interchange sender internal identification  an..35
 * Identification (for example, a division, branch or computer system/process) specified by the sender of interchange, to be included if agreed, by the recipient in response interchanges, to facilitate internal routing.
 */
public class UN_E0008 extends Element {

    public UN_E0008() {
        this(null);
    }

    public UN_E0008(String Content) {
        super("0008", "Interchange sender internal identification", "an..35", "Identification (for example, a division, branch or computer system/process) specified by the sender of interchange, to be included if agreed, by the recipient in response interchanges, to facilitate internal routing.");
        this.setContent(Content);
    }
}

