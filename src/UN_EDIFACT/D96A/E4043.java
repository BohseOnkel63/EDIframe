package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4043  Class of trade, coded  an..3
 * Code identifying the class of trade.
 */
public class E4043 extends Element {

    public E4043() {
        this(null);
    }

    public E4043(String Content) {
        super("4043", "Class of trade, coded", "an..3", "Code identifying the class of trade.", "");
        this.setContent(Content);
    }
}

