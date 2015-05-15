package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4343  Response type, coded  an..3
 * Code specifying the type of acknowledgement required or transmitted.
 */
public class E4343 extends Element {

    public E4343() {
        this(null);
    }

    public E4343(String Content) {
        super("4343", "Response type, coded", "an..3", "Code specifying the type of acknowledgement required or transmitted.", "");
        this.setContent(Content);
    }
}

