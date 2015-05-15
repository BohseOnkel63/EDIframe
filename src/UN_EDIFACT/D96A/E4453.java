package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4453  Text function, coded  an..3
 * Code specifying how to handle the text.
 */
public class E4453 extends Element {

    public E4453() {
        this(null);
    }

    public E4453(String Content) {
        super("4453", "Text function, coded", "an..3", "Code specifying how to handle the text.", "");
        this.setContent(Content);
    }
}

