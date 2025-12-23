public class Unit03{
    
    public static int shiftRight(int num)    {
        return -1;
    }
    public static int shiftRight(int num, int k){
        return -1;
    }
       public static int shiftLeft(int num){
        if(num<=999 || num>=10000){
            num = -1;
        }
        else{
            int firstDigit;
            firstDigit = num / 1000;
            num = (num-1000*firstDigit)*10;
            num = num + firstDigit;
        }
        return num;
    }
    public static int shiftLeft(int num, int k){
        return -1;
    }
    public static String shiftRight(String s)    {
        return "";
    }
    public static String shiftLeft(String s)    {
        return "";
    }
    public static String shiftLeft(String s, int k)    {
        return "";
    }
    public static String shiftRight(String s, int k)    {
        return "";
    }
    public static int countWords(String s)    {
        return -1;
    }
    public static int countParts(String s, char separator)    {
        return -1;
    }
    public static String getParts(String s, char separator)    {
        return "";
    }
    public static void printParts(String s, char separator)    {
        
    } 
    
}
