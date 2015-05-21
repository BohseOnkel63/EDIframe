package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C088 extends CompositeElement {
    public E3433 e3433 = new E3433();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E3434 e3434 = new E3434();
    public E1131 e1131_1 = new E1131();
    public E3055 e3055_1 = new E3055();
    public E3432 e3432 = new E3432();
    public E3436 e3436 = new E3436();


    public C088() {
        this(false, null, null, null, null, null, null, null, null);
    }


    public C088(Boolean Mandatory, String s3433, String s1131, String s3055, String s3434, String s1131_1, String s3055_1, String s3432, String s3436) {
        super("C088", "INSTITUTION IDENTIFICATION", "Identification of a financial institution by code branch number, or name and name of place. Code or branch number preferred.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e3433, e1131, e3055, e3434, e1131_1, e3055_1, e3432, e3436}));
        e3433.setContent(s3433);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e3434.setContent(s3434);
        e1131_1.setContent(s1131_1);
        e3055_1.setContent(s3055_1);
        e3432.setContent(s3432);
        e3436.setContent(s3436);
    }


}

