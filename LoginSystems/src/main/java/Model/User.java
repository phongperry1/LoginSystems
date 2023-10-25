
package Model;


public class User {
    protected final String ACCOUNT_NUMBER_VALID = "^\\d{10}$";
    protected final char[] chars = {'1', 'A', 'a', 'B', 'b', 'C', 'c', '2', 'D', 'd', 'E',
                                  'e', 'F', 'f', '3', 'G', 'g', 'H', 'h', 'I', 'i', 'J',
                                  'j', 'K', 'k', 'L', 'l', '4', 'M', 'm', 'N', 'n', 'O',
                                  'o', '5', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T',
                                  't', '6', '7', 'U', 'u', 'V', 'v', 'U', 'u', 'W', 'w',
                                  '8', 'X', 'x', 'Y', 'y', 'Z', 'z', '9'};

    public User() {
        
    }

    public String getACCOUNT_NUMBER_VALID() {
        return ACCOUNT_NUMBER_VALID;
    }

    public char[] getChars() {
        return chars;
    }
    
  

}

