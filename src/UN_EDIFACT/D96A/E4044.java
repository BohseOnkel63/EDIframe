package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4044  Safety section name  an..70
 * To identify the safety section name.
 */
public class E4044 extends Element {

    public E4044() {
        this(null);
    }

    public E4044(String Content) {
        super("4044", "Safety section name", "an..70", "To identify the safety section name.", "");
        this.setContent(Content);
    }
}

