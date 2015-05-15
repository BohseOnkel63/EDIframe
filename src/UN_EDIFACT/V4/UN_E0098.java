package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0098  Erroneous data element position in segment  n..3
 * The numerical count position of the stand-alone or composite data element in error. The segment code and each following stand-alone or composite data element defined in the segment description shall cause the count to be incremented. The segment tag has position number 1.
 */
public class UN_E0098 extends Element {

    public UN_E0098() {
        this(null);
    }

    public UN_E0098(String Content) {
        super("0098", "Erroneous data element position in segment", "n..3", "The numerical count position of the stand-alone or composite data element in error. The segment code and each following stand-alone or composite data element defined in the segment description shall cause the count to be incremented. The segment tag has position number 1.");
        this.setContent(Content);
    }
}

