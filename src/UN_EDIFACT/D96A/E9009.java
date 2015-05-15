package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9009  Occupation, coded  an..3
 * Code identifying an occupation.
 */
public class E9009 extends Element {

    public E9009() {
        this(null);
    }

    public E9009(String Content) {
        super("9009", "Occupation, coded", "an..3", "Code identifying an occupation.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

