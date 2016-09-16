/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UN_EDIFACT;

/**
 *
 * @author mannelini
 */
public class EdiFunctions  {

    /**
    * trim removes empty elements from the end of composite element or segment.
    * 
    * @param str
    * @return trimmed string
    */
   public static String trim(String str) {
       int endpoint;
       endpoint = str.length();
       //System.out.println("EdiFunctions.trim(): str = " +  str + ", endpoint = " + endpoint);
       //System.out.println("EdiFunctions.trim(): last char: str[" + (endpoint - 1) + "]=" + str.charAt(endpoint - 1));
        for (int i = str.length() - 1; i >= 0; i--) {
            if ((str.charAt(i) == ':')||(str.charAt(i) == '+')) {
                endpoint = i;
                //System.out.println("EdiFunctions.trim(): endpoint = " + endpoint);
            } else {
                break;
            }
        }
        return str.substring(0, endpoint);
   }
   
   /**
    * 
    * @param Tag String TAG of element
    * @param Mandatory Boolean is element mandatory in Composite element or in segment
    * @param FormatString 
    * @param Content String the content of element
    * @throws ValidityException 
    */ 
   public static void validateElement(String Tag, Boolean Mandatory, String FormatString, String Content) throws ValidityException {
        int PointPoint;
        boolean AN = false;
        boolean N = false;
        boolean A = false;
        boolean fixedLength = false;
        String lengthStr;
        int minLength;
        int length;
        int lsp = -1; // "length starting point"
        
        if (Mandatory && ((Content == null) || (Content.length() == 0))){
            throw new ValidityException("Mandatory element " + Tag + " is empty!");
        }
        if ((FormatString == null) || FormatString.length() == 0) {
            throw new ValidityException("Format of element is unknown!");
        }
        PointPoint = FormatString.indexOf("..");
        if (PointPoint > 0) {
            // Variable length
            if (FormatString.toLowerCase().startsWith("an..")) {
                AN = true;
                lsp = 4;
            } else if (FormatString.toLowerCase().startsWith("n..")) {
               N = true;
               lsp = 3;
            } else if (FormatString.toLowerCase().startsWith("a..")) {
                A = true;
                lsp = 3;
            } else {
                throw new ValidityException("Format string of element (" + FormatString + ") is invalid!");
            }
        } else {
            // Fixed length
            fixedLength = true;
            if (FormatString.toLowerCase().startsWith("an")) {
                AN = true;
                lsp = 2;
            } else if (FormatString.toLowerCase().startsWith("n")) {
               N = true;
               lsp = 1;
            } else if (FormatString.toLowerCase().startsWith("a")) {
                A = true;
                lsp = 1;
            } else {
                throw new ValidityException("Format string of element (" + FormatString + ") is invalid!");
            }
        }
        lengthStr = FormatString.substring(lsp);
        length = Integer.parseInt(lengthStr);
        if (fixedLength) {
            minLength = length;
        } else {
            minLength = 0;
        }
        if (Content != null) {
            if (Content.length() > length) {
                throw new ValidityException(Tag +": Content of element too long! Length of content: "+ Content.length() + ", max length: " + length);
            } else if (Content.length() < minLength) {
                throw new ValidityException(Tag +": Content of element too short! Length of content: "+ Content.length() + ", required length: " + length);
            }
        }
        if (N) {
            try {
                Float.parseFloat(Tag);
            } catch(NumberFormatException ne) {
                throw new ValidityException(Tag + ": Invalid numeric value \"" + Content + "\"!");
            }
        }
    } // validate()
   //public static 
}
