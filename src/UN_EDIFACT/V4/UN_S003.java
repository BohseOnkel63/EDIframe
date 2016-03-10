/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UN_EDIFACT.V4;

import UN_EDIFACT.EdiFunctions;
import UN_EDIFACT.ValidityException;

/**
 *
 * @author mannelini
 */
public class UN_S003 {
    private final String Tag = "S003";
    private final String Description = "INTERCHANGE RECIPIENT";
    private final String LongDescription  = "Identification of the recipient of the interchange.";
    private final boolean Mandatory = false;

    /**
     *
     */
    public UN_E0010 e0010;

    /**
     *
     */
    public UN_E0007 e0007;

    /**
     *
     */
    public UN_E0014 e0014;

    /**
     *
     */
    public UN_E0046 e0046;

    /**
     *
     */
    public UN_S003() {
        this(null, null, null, null);
    }
    
    /**
     *
     * @param s0010
     * @param s0007
     * @param s0014
     * @param s0046
     */
    public UN_S003(String s0010, String s0007, String s0014, String s0046) {
        e0010 = new UN_E0010(s0010);
        e0010.setMandatory(true);
        e0007 = new UN_E0007(s0007);
        e0014 = new UN_E0014(s0014);
        e0046 = new UN_E0046(s0046);
    }

    /**
     *
     * @throws ValidityException
     */
    public void validate() throws ValidityException {
        try {
            e0010.validate();
            e0007.validate();
            e0014.validate();
            e0046.validate();
        } catch (ValidityException ex) {
            throw new ValidityException(this.Tag + "/" + ex.getMessage());
        }
    }
    
    @Override
    public String toString() {
        String output;

        output = e0010.toString() + ":" + e0007.toString() + ":" + e0014.toString() + ":" + e0046.toString();
        return EdiFunctions.trim(output);
    }
    public void setContent(String ediString) {
        String[] array = ediString.split(":");
        try {
            e0010.setContent(array[0]);
            e0007.setContent(array[1]);
            e0014.setContent(array[2]);
            e0046.setContent(array[3]);
        } catch(java.lang.ArrayIndexOutOfBoundsException ex) {
            //System.out.println("UN_S003: ArrayIndexOutOfBoundsException: " + ex.getMessage());
        }
    }

    public String describe() {
        String output;
        output = this.Tag + " " + this.Description + " " + this.LongDescription + "\n" +
                "  " + e0010.describe() + "\n" +
                "  " + e0007.describe() + "\n" +
                "  " + e0014.describe() + "\n" +
                "  " + e0046.describe() + "\n";
        return output;
    }

}
