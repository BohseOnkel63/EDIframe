package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3289  Person characteristic qualifier  an..3
 * To specify the type of specific person characteristic.
 */
public class E3289 extends Element {

    public E3289() {
        this(null);
    }

    public E3289(String Content) {
        super("3289", "Person characteristic qualifier", "an..3", "To specify the type of specific person characteristic.", "");
        this.setContent(Content);
    }
}

