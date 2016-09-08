package UN_EDIFACT.D96A;

import UN_EDIFACT.CompositeElement;


public class C222 extends CompositeElement {
    public E8213 e8213;
    public E1131 e1131;
    public E3055 e3055;
    public E8212 e8212;
    public E8453 e8453;


    public C222() {
        this(false, null, null, null, null, null);
    }


    public C222(Boolean Mandatory, String s8213, String s1131, String s3055, String s8212, String s8453) {
        super("C222", "TRANSPORT IDENTIFICATION", "Code and/or name identifying the means of transport.");
        this.setMandatory(Mandatory);
        e8213 = new E8213();
        e1131 = new E1131();
        e3055 = new E3055();
        e8212 = new E8212();
        e8453 = new E8453();
        e8213.setContent(s8213);
        e1131.setContent(s1131);
        e3055.setContent(s3055);
        e8212.setContent(s8212);
        e8453.setContent(s8453);
        addElement(e8213);
        addElement(e1131);
        addElement(e3055);
        addElement(e8212);
        addElement(e8453);
    }


}

