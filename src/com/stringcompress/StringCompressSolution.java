package com.stringcompress;

public class StringCompressSolution {
	
	/**
     * desired out put is: a2blc5a3
     * */
    public static String StringCompress(String str){

        if(str.isEmpty()||str.length()==0){
            return str;}

        int count =0;
        StringBuilder result = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            if((i+1)<str.length()&&str.charAt(i)==str.charAt(i+1))
            {
                count++;
            }
            else{
                count++;
                result.append(str.charAt(i)+""+count);
                count=0;
            }
        }
        if(result.toString().length()>=str.length()){
            return str;
        }else
            {
                return result.toString();
            }
    }
    
    public static void main(String[]args){
        System.out.println(StringCompress("aabcccccaaa"));
        System.out.println(StringCompress("xiubinzheng"));


    }

}
