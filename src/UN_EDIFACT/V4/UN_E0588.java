package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0588  Number of security segments  n..10
 * The number of security segments in a security header/trailer group pair, plus the USD and USU segments where the security header/trailer group pair is used for encryption.
 */
public class UN_E0588 extends Element {

    public UN_E0588() {
        this(null);
    }

    public UN_E0588(String Content) {
        super("0588", "Number of security segments", "n..10", "The number of security segments in a security header/trailer group pair, plus the USD and USU segments where the security header/trailer group pair is used for encryption.");
        this.setContent(Content);
    }
}

