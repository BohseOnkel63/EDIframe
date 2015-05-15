package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 6245  Temperature qualifier  an..3
 * A code giving specific meaning to the temperature.
 */
public class E6245 extends Element {

    public E6245() {
        this(null);
    }

    public E6245(String Content) {
        super("6245", "Temperature qualifier", "an..3", "A code giving specific meaning to the temperature.", "");
        this.setContent(Content);
    }
}

