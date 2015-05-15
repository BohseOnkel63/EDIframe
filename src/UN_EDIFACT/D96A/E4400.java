package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4400  Instruction  an..35
 * Description of an instruction.
 */
public class E4400 extends Element {

    public E4400() {
        this(null);
    }

    public E4400(String Content) {
        super("4400", "Instruction", "an..35", "Description of an instruction.", "");
        this.setContent(Content);
    }
}

