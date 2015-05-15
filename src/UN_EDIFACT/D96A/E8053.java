package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8053  Equipment qualifier  an..3
 * Code identifying type of equipment.
 */
public class E8053 extends Element {

    public E8053() {
        this(null);
    }

    public E8053(String Content) {
        super("8053", "Equipment qualifier", "an..3", "Code identifying type of equipment.", "");
        this.setContent(Content);
    }
}

