package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4517  Seal condition, coded  an..3
 * To indicate the condition of a seal.
 */
public class E4517 extends Element {

    public E4517() {
        this(null);
    }

    public E4517(String Content) {
        super("4517", "Seal condition, coded", "an..3", "To indicate the condition of a seal.", "");
        this.setContent(Content);
    }
}

