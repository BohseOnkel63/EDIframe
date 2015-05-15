package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3279  Geographic environment, coded  an..3
 * Describe the geographic area for message.
 */
public class E3279 extends Element {

    public E3279() {
        this(null);
    }

    public E3279(String Content) {
        super("3279", "Geographic environment, coded", "an..3", "Describe the geographic area for message.", "");
        this.setContent(Content);
    }
}

