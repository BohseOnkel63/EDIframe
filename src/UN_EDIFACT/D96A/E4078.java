package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4078  Handling instructions  an..70
 * Instructions on how specified goods, packages or containers should be handled.
 */
public class E4078 extends Element {

    public E4078() {
        this(null);
    }

    public E4078(String Content) {
        super("4078", "Handling instructions", "an..70", "Instructions on how specified goods, packages or containers should be handled.", "");
        this.setContent(Content);
    }
}

