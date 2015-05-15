package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0104  Erroneous component data element position  n..3
 * The numerical count position of the component data element in error. Each component data element position defined in the composite data element description shall cause the count to be incremented. The count starts at 1.
 */
public class UN_E0104 extends Element {

    public UN_E0104() {
        this(null);
    }

    public UN_E0104(String Content) {
        super("0104", "Erroneous component data element position", "n..3", "The numerical count position of the component data element in error. Each component data element position defined in the composite data element description shall cause the count to be incremented. The count starts at 1.");
        this.setContent(Content);
    }
}

