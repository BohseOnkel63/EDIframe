package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3227  Place/location qualifier  an..3
 * Code identifying the function of a location.
 */
public class E3227 extends Element {

    public E3227() {
        this(null);
    }

    public E3227(String Content) {
        super("3227", "Place/location qualifier", "an..3", "Code identifying the function of a location.", "");
        this.setContent(Content);
    }
}

