//number of Palindromes  in a String...... 

import java.util.StringTokenizer;
 
public class StringTokenizerSample1
{
    public static void main(String[] args)
    {
        StringTokenizer st =
                new StringTokenizer("madam 1771 adaddada mama");
// System.out.println("madam 1771 adaddada mama");
 int count=0;
        // get how many tokens inside st object
        System.out.println("tokens count: " + st.countTokens());
 
        // iterate st object to get more tokens from it
        while (st.hasMoreElements())
        {
            String token = st.nextElement().toString();
            System.out.println("token = " + token);
String result = new StringBuffer(token).reverse().toString();
System.out.println("reverse = " + result);

//if (token.equals(result))
if ((token==result)||( token.equals( result )))
{
System.out.println("reverse = " + result+" "+token);
      count++;
}

   }
System.out.println(count);
 
        
    }
}