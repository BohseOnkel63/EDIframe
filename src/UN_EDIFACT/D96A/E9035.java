package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9035  Qualification area, coded  an..3
 * Code identifying the application area of a qualification.
 */
public class E9035 extends Element {

    public E9035() {
        this(null);
    }

    public E9035(String Content) {
        super("9035", "Qualification area, coded", "an..3", "Code identifying the application area of a qualification.", "");
        this.setContent(Content);
    }
}

