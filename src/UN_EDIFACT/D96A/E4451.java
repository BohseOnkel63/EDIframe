package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4451  Text subject qualifier  an..3
 * Code specifying subject of a free text.
 */
public class E4451 extends Element {

    public E4451() {
        this(null);
    }

    public E4451(String Content) {
        super("4451", "Text subject qualifier", "an..3", "Code specifying subject of a free text.", "");
        this.setContent(Content);
    }
}

