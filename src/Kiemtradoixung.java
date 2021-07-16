import java.util.Scanner;
import java.util.Stack;

public class Kiemtradoixung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra tính đối xứng");
        String ch = sc.nextLine();
        System.out.println(ch.charAt(4));
        Stack<Character> Str = new Stack<>();
        for(int i=0;i<ch.length();i++){
            Str.push(ch.charAt(i));
        }
        String chuoi = "";
        for(int i=Str.size();i>0;i--){
            chuoi+= Str.pop();
        }
        if(ch.equals(chuoi)){
            System.out.println("chuỗi vừa nhập là chuỗi đối xứng");
        }else{
            System.out.println("chuỗi vừa nhập không đối xứng");
        }

    }
}
