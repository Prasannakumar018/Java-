public String toUpperCase(0Locale locale) {  
      if (locale == null) {  
          throw new NullPointerException();  
      }  
  
      int firstLower;  
      final int len = value.length;  
  
      /* Now check if there are any characters that need to be changed. */  
      scan: {  
         for (firstLower = 0 ; firstLower < len; ) {  
              int c = (int)value[firstLower];  
              int srcCount;  
              if ((c >= Character.MIN_HIGH_SURROGATE)  
                      && (c <= Character.MAX_HIGH_SURROGATE)) {  
                  c = codePointAt(firstLower);  
                  srcCount = Character.charCount(c);  
              } else {  
                  srcCount = 1;  
              }  
              int upperCaseChar = Character.toUpperCaseEx(c);  
              if ((upperCaseChar == Character.ERROR)  
                      || (c != upperCaseChar)) {  
                  break scan;  
              }  
              firstLower += srcCount;  
          }  
          return this;  
      }  
  
      char[] result = new char[len]; /* may grow */  
      int resultOffset = 0;  /* result may grow, so i+resultOffset 
       * is the write location in result */  
  
      /* Just copy the first few upperCase characters. */  
      System.arraycopy(value, 0, result, 0, firstLower);  
  
      String lang = locale.getLanguage();  
      boolean localeDependent =  
              (lang == "tr" || lang == "az" || lang == "lt");  
      char[] upperCharArray;  
      int upperChar;  
      int srcChar;  
      int srcCount;  
      for (int i = firstLower; i < len; i += srcCount) {  
          srcChar = (int)value[i];  
          if ((char)srcChar >= Character.MIN_HIGH_SURROGATE &&  
              (char)srcChar <= Character.MAX_HIGH_SURROGATE) {  
              srcChar = codePointAt(i);  
              srcCount = Character.charCount(srcChar);  
          } else {  
              srcCount = 1;  
          }  
          if (localeDependent) {  
              upperChar = ConditionalSpecialCasing.toUpperCaseEx(this, i, locale);  
          } else {  
              upperChar = Character.toUpperCaseEx(srcChar);  
          }  
          if ((upperChar == Character.ERROR)  
                  || (upperChar >= Character.MIN_SUPPLEMENTARY_CODE_POINT)) {  
              if (upperChar == Character.ERROR) {  
                  if (localeDependent) {  
                      upperCharArray =  
                              ConditionalSpecialCasing.toUpperCaseCharArray(this, i, locale);  
                  } else {  
                      upperCharArray = Character.toUpperCaseCharArray(srcChar);  
                  }  
              } else if (srcCount == 2) {  
                  resultOffset += Character.toChars(upperChar, result, i + resultOffset) - srcCount;  
                  continue;  
              } else {  
                  upperCharArray = Character.toChars(upperChar);  
              }  
  
              /* Grow result if needed */  
              int mapLen = upperCharArray.length;  
              if (mapLen > srcCount) {  
                  char[] result2 = new char[result.length + mapLen - srcCount];  
                  System.arraycopy(result, 0, result2, 0, i + resultOffset);  
                  result = result2;  
              }  
              for (int x = 0; x < mapLen; ++x) {  
                  result[i + resultOffset + x] = upperCharArray[x];  
              }  
              resultOffset += (mapLen - srcCount);  
          } else {  
              result[i + resultOffset] = (char)upperChar;  
          }  
      }  
      return new String(result, 0, len + resultOffset);  
  }  
Signature
There are two variant of toUpperCase() method. The signature or syntax of string toUpperCase() method is given below:

public String toUpperCase()  
public String toUpperCase(Locale locale)  
The second method variant of toUpperCase(), converts all the characters into uppercase using the rules of given Locale.

Returns
string in uppercase letter.

Java String toUpperCase() method example
public class StringUpperExample{  
public static void main(String args[]){  
String s1="hello string";  
String s1upper=s1.toUpperCase();  
System.out.println(s1upper);  
}}  
Test it Now
Output:

HELLO STRING
Java String toUpperCase(Locale locale) Method Example 2
import java.util.Locale;  
public class StringUpperExample2 {  
    public static void main(String[] args) {  
        String s = "hello string";    
        String turkish = s.toUpperCase(Locale.forLanguageTag("tr"));  
        String english = s.toUpperCase(Locale.forLanguageTag("en"));  
        System.out.println(turkish);//will print I with dot on upper side  
        System.out.println(english);  
    }  
}
