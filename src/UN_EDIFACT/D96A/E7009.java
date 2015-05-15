package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7009  Item description identification  an..17
 * Code from an industry code list which provides specific data about a product characteristic.
 */
public class E7009 extends Element {

    public E7009() {
        this(null);
    }

    public E7009(String Content) {
        super("7009", "Item description identification", "an..17", "Code from an industry code list which provides specific data about a product characteristic.", "User or association defined code.  May be used in combination with 1131/3055.");
        this.setContent(Content);
    }
}

