package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3155  Communication channel qualifier  an..3
 * Code identifying the type of communication channel being used.
 */
public class E3155 extends Element {

    public E3155() {
        this(null);
    }

    public E3155(String Content) {
        super("3155", "Communication channel qualifier", "an..3", "Code identifying the type of communication channel being used.", "");
        this.setContent(Content);
    }
}

