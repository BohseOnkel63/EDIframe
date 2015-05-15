package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4401  Instruction, coded  an..3
 * Specification of an action to be taken by the receiver of the message.
 */
public class E4401 extends Element {

    public E4401() {
        this(null);
    }

    public E4401(String Content) {
        super("4401", "Instruction, coded", "an..3", "Specification of an action to be taken by the receiver of the message.", "");
        this.setContent(Content);
    }
}

