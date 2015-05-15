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
public class UNB {
    private final String Tag = "UNB";
    private final String Description = "INTERCHANGE HEADER";
    private final String LongDescription = "To identify an interchange.";
    
    public UN_S001 s001 = new UN_S001();
    public UN_S002 s002 = new UN_S002();
    public UN_S003 s003 = new UN_S003();
    public UN_S004 s004 = new UN_S004();
    public UN_E0020 e0020 = new UN_E0020();
    public UN_S005 s005 = new UN_S005();
    public UN_E0026 e0026 = new UN_E0026();
    public UN_E0029 e0029 = new UN_E0029();
    public UN_E0031 e0031 = new UN_E0031();
    public UN_E0032 e0032 = new UN_E0032();
    public UN_E0035 e0035 = new UN_E0035();
    
    
    public UNB () {
    }

    public void setContent(String ediString) throws ValidityException {
        String[] array = ediString.substring(0, ediString.length() - 1).split("\\+");
        try {
            if ( ! array[0].matches(Tag)) {
                throw new ValidityException("Invalid TAG for " + this.Tag + "-segment: " + array[0] +"!");
            }
            s001.setContent(array[1]);
            s002.setContent(array[2]);
            s003.setContent(array[3]);
            s004.setContent(array[4]);
            e0020.setContent(array[5]);
            s005.setContent(array[6]);
            e0026.setContent(array[7]);
            e0029.setContent(array[8]);
            e0031.setContent(array[9]);
            e0032.setContent(array[10]);
            e0035.setContent(array[11]);
        } catch(java.lang.ArrayIndexOutOfBoundsException ex) {
            //System.out.println("UNB ArrayIndexOutOfBoundsException: " + ex.getMessage());
        }
    }
    
    @Override
    public String toString() {
        String output = "UNB+" + 
                s001.toString() + "+" +
                s002.toString() + "+" +
                s003.toString() + "+" +
                s004.toString() + "+" +
                e0020.toString() + "+" +
                s005.toString() + "+" +
                e0026.toString() + "+" +
                e0029.toString() + "+" +
                e0031.toString() + "+" +
                e0032.toString() + "+" +
                e0035.toString();
        return EdiFunctions.trim(output) + "'";
    }
    
    public String describe() {
        String output;
        
        output = this.Tag + " " + this.Description + "\n" +
                this.LongDescription + "\n\n" +
                s001.describe() + "\n" +
                s002.describe() + "\n" +
                s003.describe() + "\n" +
                s004.describe() + "\n" +
                e0020.describe() + "\n" +
                s005.describe() + "\n" +
                e0026.describe() + "\n" +
                e0029.describe() + "\n" +
                e0031.describe() + "\n" +
                e0032.describe() + "\n" +
                e0035.describe() + "\n";
        return output;
    }
}
