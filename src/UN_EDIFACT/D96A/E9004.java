package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 9004  Employment category  an..35
 * Description of employment category.
 */
public class E9004 extends Element {

    public E9004() {
        this(null);
    }

    public E9004(String Content) {
        super("9004", "Employment category", "an..35", "Description of employment category.", "");
        this.setContent(Content);
    }
}

