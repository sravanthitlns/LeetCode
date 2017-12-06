/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversevowelsinstring;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author srtalluri
 */
public class ReverseVowelsInString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public String reverseVowels(String s) {
        char[] StringArr = s.toCharArray();
        StringBuilder sb = new StringBuilder(s);
        Pattern p = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(sb.reverse().toString());
        for(int i = 0; i < StringArr.length; i++){
            if(isVowel(StringArr[i])){
                if(m.find()){
                    StringArr[i] = m.group().charAt(0);
                }
            }
        }
        return new String(StringArr);
    }
    
    public boolean isVowel(char v){
        return v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' || 
                v == 'A' || v == 'E' || v == 'I' || v == 'O' || v == 'U';
    }
    
}
