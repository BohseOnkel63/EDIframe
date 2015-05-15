package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 1225  Message function, coded  an..3
 * Code indicating the function of the message.
 */
public class E1225 extends Element {

    public E1225() {
        this(null);
    }

    public E1225(String Content) {
        super("1225", "Message function, coded", "an..3", "Code indicating the function of the message.", "");
        this.setContent(Content);
    }
}

