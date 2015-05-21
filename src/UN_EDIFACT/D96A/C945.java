package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;
import UN_EDIFACT.Element;
import java.util.ArrayList;
import java.util.Arrays;


public class C945 extends CompositeElement {
    public E7455 e7455 = new E7455();
    public E7457 e7457 = new E7457();
    public E1131 e1131 = new E1131();
    public E3055 e3055 = new E3055();
    public E7456 e7456 = new E7456();


    public C945() {
        this(false, null, null, null, null, null);
    }


    public C945(Boolean Mandatory, String s7455, String s7457, String s1131, String s3055, String s7456) {
        super("C945", "MEMBERSHIP LEVEL", "Identification of a membership level.");
        this.setMandatory(Mandatory);
        super.setElementList((ArrayList) Arrays.asList(new Element[]{e7455, e7457, e1131, e3055, e7456}));
        e7455.setContent(s7455);
        e7455.setMandatory(true);
        e7457.setContent(s7457);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e7456.setContent(s7456);
    }


}

