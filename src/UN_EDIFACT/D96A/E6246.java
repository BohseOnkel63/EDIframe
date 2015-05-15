package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6246  Temperature setting  n3
 * The actual temperature value in degrees Celsius (e.g. 008, 020).
 */
public class E6246 extends Element {

    public E6246() {
        this(null);
    }

    public E6246(String Content) {
        super("6246", "Temperature setting", "n3", "The actual temperature value in degrees Celsius (e.g. 008, 020).", "");
        this.setContent(Content);
    }
}

