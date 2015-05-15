package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1518  Value list identifier  an..35
 * The identifier of a coded or non coded value list.
 */
public class E1518 extends Element {

    public E1518() {
        this(null);
    }

    public E1518(String Content) {
        super("1518", "Value list identifier", "an..35", "The identifier of a coded or non coded value list.", "");
        this.setContent(Content);
    }
}

