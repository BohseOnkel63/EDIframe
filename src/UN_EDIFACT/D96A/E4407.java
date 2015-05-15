package UN_EDIFACT.D96A;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT D.96A
 * 4407  Sample process status, coded  an..3
 * Code specifying the stage in the product development cycle at which the specimen was selected for testing.
 */
public class E4407 extends Element {

    public E4407() {
        this(null);
    }

    public E4407(String Content) {
        super("4407", "Sample process status, coded", "an..3", "Code specifying the stage in the product development cycle at which the specimen was selected for testing.", "");
        this.setContent(Content);
    }
}

