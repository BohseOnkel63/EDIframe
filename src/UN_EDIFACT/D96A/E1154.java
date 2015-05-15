package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1154  Reference number  an..35
 * Identification number the nature and function of which can be qualified by an entry in data element 1153 Reference qualifier.
 */
public class E1154 extends Element {

    public E1154() {
        this(null);
    }

    public E1154(String Content) {
        super("1154", "Reference number", "an..35", "Identification number the nature and function of which can be qualified by an entry in data element 1153 Reference qualifier.", "");
        this.setContent(Content);
    }
}

