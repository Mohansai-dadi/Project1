package EX_04_Operators;

public class Lab38_Logical_Operators {
    public static void main(String[] args) {

        boolean a = true;
        System.out.println(!a);

        boolean b = true;
        System.out.println(!!b);

        boolean c= true || false; // For ||(OR) if 1/true there its TRUE

        System.out.println(c);

        boolean c1= true && false; // For &&(AND) if 0/false there its FALSE
        System.out.println(c1);

    }
}
