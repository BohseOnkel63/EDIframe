package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 7434  Agreement type description  an..70
 * Description of the type of agreement.
 */
public class E7434 extends Element {

    public E7434() {
        this(null);
    }

    public E7434(String Content) {
        super("7434", "Agreement type description", "an..70", "Description of the type of agreement.", "");
        this.setContent(Content);
    }
}

