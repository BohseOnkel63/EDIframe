package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 8067  Mode of transport, coded  an..3
 * Coded method of transport used for the carriage of the goods.
 */
public class E8067 extends Element {

    public E8067() {
        this(null);
    }

    public E8067(String Content) {
        super("8067", "Mode of transport, coded", "an..3", "Coded method of transport used for the carriage of the goods.", "Use UN/ECE Recommendation No 19.");
        this.setContent(Content);
    }
}

