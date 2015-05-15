package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4403  Instruction qualifier  an..3
 * Code giving specific meaning to the type of instructions.
 */
public class E4403 extends Element {

    public E4403() {
        this(null);
    }

    public E4403(String Content) {
        super("4403", "Instruction qualifier", "an..3", "Code giving specific meaning to the type of instructions.", "");
        this.setContent(Content);
    }
}

