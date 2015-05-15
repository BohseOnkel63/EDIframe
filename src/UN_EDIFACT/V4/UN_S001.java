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
public class UN_S001 {
    private final String Tag = "S001";
    private final String Description = "SYNTAX IDENTIFIER";
    private final String LongDescription  = "Identification of the agency controlling the syntax, the syntax level and version number, and the service code directory.";
    private final boolean Mandatory = false;

    /**
     *
     */
    public UN_E0001 e0001;

    /**
     *
     */
    public UN_E0002 e0002;

    /**
     *
     */
    public UN_E0080 e0080;

    /**
     *
     */
    public UN_E0133 e0133;

    /**
     *
     */
    public UN_S001() {
        this(null, null, null, null);
    }
    
    /**
     *
     * @param s0001
     * @param s0002
     * @param s0080
     * @param s0133
     */
    public UN_S001(String s0001, String s0002, String s0080, String s0133) {
        e0001 = new UN_E0001(s0001);
        e0001.setMandatory(true);
        e0002 = new UN_E0002(s0002);
        e0002.setMandatory(true);
        e0080 = new UN_E0080(s0080);
        e0133 = new UN_E0133(s0133);
    }

    /**
     *
     * @throws ValidityException
     */
    public void validate() throws ValidityException {
        try {
            e0001.validate();
            e0002.validate();
            e0080.validate();
            e0133.validate();
        } catch (ValidityException ex) {
            throw new ValidityException(this.Tag + "/" + ex.getMessage());
        }
    }
    
    @Override
    public String toString() {
        String output;

        output = e0001.toString() + ":" + e0002.toString() + ":" + e0080.toString() + ":" + e0133.toString();
        return EdiFunctions.trim(output);
    }

    public void setContent(String ediString) {
        String[] array = ediString.split(":");
        try {
            e0001.setContent(array[0]);
            e0002.setContent(array[1]);
            //e0080.setContent(array[2]);
            //e0133.setContent(array[3]);
        } catch(java.lang.ArrayIndexOutOfBoundsException ex) {
            //System.out.println("UN_S001: ArrayIndexOutOfBoundsException: " + ex.getMessage());
        }
    }
    
    public String describe() {
        String output = this.Tag + " " + this.Description + " " + this.LongDescription + "\n" +
                "  " + e0001.describe() + "\n" +
                "  " + e0002.describe() + "\n" +
                "  " + e0080.describe() + "\n" +
                "  " + e0133.describe() + "\n";
        return output;
    }
}
