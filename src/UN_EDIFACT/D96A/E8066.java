package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8066  Mode of transport  an..17
 * Method of transport used for the carriage of the goods.
 */
public class E8066 extends Element {

    public E8066() {
        this(null);
    }

    public E8066(String Content) {
        super("8066", "Mode of transport", "an..17", "Method of transport used for the carriage of the goods.", "");
        this.setContent(Content);
    }
}

