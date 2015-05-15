package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9018  Attribute  an..35
 * Description of an attribute of an entity.
 */
public class E9018 extends Element {

    public E9018() {
        this(null);
    }

    public E9018(String Content) {
        super("9018", "Attribute", "an..35", "Description of an attribute of an entity.", "");
        this.setContent(Content);
    }
}

