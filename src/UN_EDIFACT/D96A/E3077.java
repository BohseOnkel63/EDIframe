package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3077  Test media, coded  an..3
 * Code specifying the medium on which the test was applied, e.g. animal, human.
 */
public class E3077 extends Element {

    public E3077() {
        this(null);
    }

    public E3077(String Content) {
        super("3077", "Test media, coded", "an..3", "Code specifying the medium on which the test was applied, e.g. animal, human.", "");
        this.setContent(Content);
    }
}

