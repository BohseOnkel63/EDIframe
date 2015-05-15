package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6066  Control value  n..18
 * Value obtained from summing the values specified by the Control Qualifier throughout the message (Hash total).
 */
public class E6066 extends Element {

    public E6066() {
        this(null);
    }

    public E6066(String Content) {
        super("6066", "Control value", "n..18", "Value obtained from summing the values specified by the Control Qualifier throughout the message (Hash total).", "");
        this.setContent(Content);
    }
}

