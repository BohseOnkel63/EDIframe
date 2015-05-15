package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3236  Sample location  an..35
 * Free form description of the location within the specimen, from which the sample was taken.
 */
public class E3236 extends Element {

    public E3236() {
        this(null);
    }

    public E3236(String Content) {
        super("3236", "Sample location", "an..35", "Free form description of the location within the specimen, from which the sample was taken.", "");
        this.setContent(Content);
    }
}

