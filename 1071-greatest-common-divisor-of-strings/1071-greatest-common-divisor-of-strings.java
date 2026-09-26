class Solution {
    public static int GCD(int a,int b){
        while(b!=0){
            int remainder=a%b;
            a=b;
            b=remainder;
        }
        return a;
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int gcd=GCD(str1.length(),str2.length());
        return str1.substring(0,gcd);
    }
}