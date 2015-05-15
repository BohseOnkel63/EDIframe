package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0014  Interchange recipient internal identification  an..35
 * Identification (for example, a division, branch or computer system/process) specified by the recipient of interchange, to be included if agreed, by the sender in response interchanges, to facilitate internal routing.
 */
public class UN_E0014 extends Element {

    public UN_E0014() {
        this(null);
    }

    public UN_E0014(String Content) {
        super("0014", "Interchange recipient internal identification", "an..35", "Identification (for example, a division, branch or computer system/process) specified by the recipient of interchange, to be included if agreed, by the sender in response interchanges, to facilitate internal routing.");
        this.setContent(Content);
    }
}

