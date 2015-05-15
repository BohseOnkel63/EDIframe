package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9308  Seal number  an..10
 * The number of a custom seal or another seal affixed to the containers or other transport unit.
 */
public class E9308 extends Element {

    public E9308() {
        this(null);
    }

    public E9308(String Content) {
        super("9308", "Seal number", "an..10", "The number of a custom seal or another seal affixed to the containers or other transport unit.", "");
        this.setContent(Content);
    }
}

