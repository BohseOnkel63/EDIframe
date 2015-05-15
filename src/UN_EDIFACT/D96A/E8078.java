package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8078  Hazard substance/item/page number  an..7
 * Number giving additional hazard code classification of a goods item within the applicable dangerous goods regulation.
 */
public class E8078 extends Element {

    public E8078() {
        this(null);
    }

    public E8078(String Content) {
        super("8078", "Hazard substance/item/page number", "an..7", "Number giving additional hazard code classification of a goods item within the applicable dangerous goods regulation.", "");
        this.setContent(Content);
    }
}

