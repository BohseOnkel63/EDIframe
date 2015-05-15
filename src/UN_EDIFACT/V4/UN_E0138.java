package UN_EDIFACT.V4;

import UN_EDIFACT.Element;

/**
 * UN-EDIFACT SYNTAX VERSION 4
 * 0138  Security segment position  n..6
 * The numerical count position of a specific security segment that is within the actual received security header/trailer segment group pair, identified by its security reference number. The numbering starts with, and includes, the USH segment as segment number 1. To identify a security segment that contains an error, this is the numerical count position of that security segment. To report that a security segment is missing, this is the numerical count position of the last security segment that was processed before the position where the missing security segment was expected to be. A missing security segment group is denoted by identifying the first segment in the security segment group as missing.
 */
public class UN_E0138 extends Element {

    public UN_E0138() {
        this(null);
    }

    public UN_E0138(String Content) {
        super("0138", "Security segment position", "n..6", "The numerical count position of a specific security segment that is within the actual received security header/trailer segment group pair, identified by its security reference number. The numbering starts with, and includes, the USH segment as segment number 1. To identify a security segment that contains an error, this is the numerical count position of that security segment. To report that a security segment is missing, this is the numerical count position of the last security segment that was processed before the position where the missing security segment was expected to be. A missing security segment group is denoted by identifying the first segment in the security segment group as missing.");
        this.setContent(Content);
    }
}

