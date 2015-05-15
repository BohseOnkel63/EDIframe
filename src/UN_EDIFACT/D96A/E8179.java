package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8179  Type of means of transport identification  an..8
 * Code defining the type of the means of transport being utilized.
 */
public class E8179 extends Element {

    public E8179() {
        this(null);
    }

    public E8179(String Content) {
        super("8179", "Type of means of transport identification", "an..8", "Code defining the type of the means of transport being utilized.", "No international codes available.");
        this.setContent(Content);
    }
}

