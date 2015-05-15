package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7491  Type of inventory affected, coded  an..3
 * To specify the type of inventory which is affected by an inventory movement or expressed in an inventory balance.
 */
public class E7491 extends Element {

    public E7491() {
        this(null);
    }

    public E7491(String Content) {
        super("7491", "Type of inventory affected, coded", "an..3", "To specify the type of inventory which is affected by an inventory movement or expressed in an inventory balance.", "");
        this.setContent(Content);
    }
}

