package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1366  Document/message source  an..35
 * Indication of the source from which the printed information is to be or has been obtained.
 */
public class E1366 extends Element {

    public E1366() {
        this(null);
    }

    public E1366(String Content) {
        super("1366", "Document/message source", "an..35", "Indication of the source from which the printed information is to be or has been obtained.", "");
        this.setContent(Content);
    }
}

