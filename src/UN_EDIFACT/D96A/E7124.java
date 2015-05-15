package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7124  UNDG number  n4
 * Unique serial number assigned within the United Nations to substances and articles contained in a list of the dangerous goods most commonly carried.
 */
public class E7124 extends Element {

    public E7124() {
        this(null);
    }

    public E7124(String Content) {
        super("7124", "UNDG number", "n4", "Unique serial number assigned within the United Nations to substances and articles contained in a list of the dangerous goods most commonly carried.", "");
        this.setContent(Content);
    }
}

