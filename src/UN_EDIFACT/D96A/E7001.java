package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7001  Physical or logical state qualifier  an..3
 * Code giving a specific meaning to a physical or logical state.
 */
public class E7001 extends Element {

    public E7001() {
        this(null);
    }

    public E7001(String Content) {
        super("7001", "Physical or logical state qualifier", "an..3", "Code giving a specific meaning to a physical or logical state.", "");
        this.setContent(Content);
    }
}

