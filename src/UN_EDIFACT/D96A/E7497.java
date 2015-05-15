package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7497  Component function qualifier  an..3
 * To identify the function of a structure component.
 */
public class E7497 extends Element {

    public E7497() {
        this(null);
    }

    public E7497(String Content) {
        super("7497", "Component function qualifier", "an..3", "To identify the function of a structure component.", "");
        this.setContent(Content);
    }
}

