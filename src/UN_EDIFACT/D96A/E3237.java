package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 3237  Sample location, coded  an..3
 * Code specifying the location, within the specimen, from which the sample was taken.
 */
public class E3237 extends Element {

    public E3237() {
        this(null);
    }

    public E3237(String Content) {
        super("3237", "Sample location, coded", "an..3", "Code specifying the location, within the specimen, from which the sample was taken.", "");
        this.setContent(Content);
    }
}

