package Coding;

import java.util.Scanner;

public class StringSkillRackEx {

    public static void Calculate(){
        Scanner in = new Scanner(System.in);
        String usrInput = in.nextLine();
        int Count = in.nextInt();
        String newString = "";
        for(int i=0; i < usrInput.length();i++){
            if(usrInput.charAt(i) == 'a'|| usrInput.charAt(i) == 'e'||usrInput.charAt(i) == 'i'||usrInput.charAt(i) == 'o'||usrInput.charAt(i) == 'u'||usrInput.charAt(i) == 'A'||usrInput.charAt(i) == 'E'||usrInput.charAt(i) == 'I'||usrInput.charAt(i) == 'O'|| usrInput.charAt(i) == 'U'){
                continue;
            }
            else{
                newString += usrInput.charAt(i);
            }
        }
        if(newString.length() >= Count){
            for(int i = 0; i < Count; i++){
                System.out.print(newString.charAt(i));
            }
            System.out.println();
        }
        else{
            System.out.println(-1);
        }
    }

    public static void main(String[] args){
        Calculate();
        Calculate();
    }
}
