package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7507  Component material, coded  an..3
 * Code identifying the material of which a component is composed (e.g. steel, plastics).
 */
public class E7507 extends Element {

    public E7507() {
        this(null);
    }

    public E7507(String Content) {
        super("7507", "Component material, coded", "an..3", "Code identifying the material of which a component is composed (e.g. steel, plastics).", "");
        this.setContent(Content);
    }
}

