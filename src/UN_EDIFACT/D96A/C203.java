package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C203 extends CompositeElement {
    public E5243 e5243 = new E5243();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E5242 e5242 = new E5242();
    public E5275 e5275 = new E5275();
    public E1131 e1131_1 = new E1131();
    public E3055 e3055_1 = new E3055();
    public E5275 e5275_1 = new E5275();
    public E1131 e1131_2 = new E1131();
    public E3055 e3055_2 = new E3055();


    public C203() {
        this(false, null, null, null, null, null, null, null, null, null, null);
    }


    public C203(Boolean Mandatory, String s5243, String s1131, String s3055, String s5242, String s5275, String s1131_1, String s3055_1, String s5275_1, String s1131_2, String s3055_2) {
        super("C203", "RATE/TARIFF CLASS", "Identification of the applicable rate/tariff class.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e5243, e1131, e3055, e5242, e5275, e1131_1, e3055_1, e5275_1, e1131_2, e3055_2}));
        e5243.setContent(s5243);
        e5243.setMandatory(true);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e5242.setContent(s5242);
        e5275.setContent(s5275);
        e1131_1.setContent(s1131_1);
        e3055_1.setContent(s3055_1);
        e5275_1.setContent(s5275_1);
        e1131_2.setContent(s1131_2);
        e3055_2.setContent(s3055_2);
    }


}

