package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7506  Component material  an..35
 * Description identifying the material of which a component is composed (e.g. steel, plastics).
 */
public class E7506 extends Element {

    public E7506() {
        this(null);
    }

    public E7506(String Content) {
        super("7506", "Component material", "an..35", "Description identifying the material of which a component is composed (e.g. steel, plastics).", "");
        this.setContent(Content);
    }
}

