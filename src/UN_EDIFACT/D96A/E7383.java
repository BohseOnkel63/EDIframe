package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7383  Surface/layer indicator, coded  an..3
 * Code indicating the surface or layer of a product that is being described.
 */
public class E7383 extends Element {

    public E7383() {
        this(null);
    }

    public E7383(String Content) {
        super("7383", "Surface/layer indicator, coded", "an..3", "Code indicating the surface or layer of a product that is being described.", "");
        this.setContent(Content);
    }
}

