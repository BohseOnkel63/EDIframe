package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0814  Number of segments before object  n..3
 * A count of the number of segments appearing between the UNO segment and the start of the object.
 */
public class UN_E0814 extends Element {

    public UN_E0814() {
        this(null);
    }

    public UN_E0814(String Content) {
        super("0814", "Number of segments before object", "n..3", "A count of the number of segments appearing between the UNO segment and the start of the object.");
        this.setContent(Content);
    }
}

