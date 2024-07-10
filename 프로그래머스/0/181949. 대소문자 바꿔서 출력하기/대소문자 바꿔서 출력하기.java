import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for(int i=0;i<a.length();i++){
            char c = a.charAt(i);
            if(Character.isUpperCase(c)){
                answer+= Character.toLowerCase(c);
            }else if(Character.isLowerCase(c)){
                answer+= Character.toUpperCase(c);
            }
        }
        System.out.println(answer);
        // isUpperCase()메서드는 c 문자를 확인하고 대문자이면 true, 소문자이면 false가 나온다.
        // 대문자일 경우 toLowerCase()메서드를 사용하여 소문자로 변환하고 , isLowerCase()메서드             를 사용하여 소문자일 경우 toUpperCase()메서드를 사용하여 대문자로 변환한다.        
    }
}