package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8178  Type of means of transport  an..17
 * Description of the type of the means of transport being utilized.
 */
public class E8178 extends Element {

    public E8178() {
        this(null);
    }

    public E8178(String Content) {
        super("8178", "Type of means of transport", "an..17", "Description of the type of the means of transport being utilized.", "");
        this.setContent(Content);
    }
}

