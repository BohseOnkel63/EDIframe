package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8158  Hazard identification number, upper part  an..4
 * The id. number for the Orange Placard (upper part) required on the means of transport.
 */
public class E8158 extends Element {

    public E8158() {
        this(null);
    }

    public E8158(String Content) {
        super("8158", "Hazard identification number, upper part", "an..4", "The id. number for the Orange Placard (upper part) required on the means of transport.", "");
        this.setContent(Content);
    }
}

