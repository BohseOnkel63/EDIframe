package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4017  Delivery plan status indicator, coded  an..3
 * Code indicating the level of commitment of schedule information.
 */
public class E4017 extends Element {

    public E4017() {
        this(null);
    }

    public E4017(String Content) {
        super("4017", "Delivery plan status indicator, coded", "an..3", "Code indicating the level of commitment of schedule information.", "");
        this.setContent(Content);
    }
}

