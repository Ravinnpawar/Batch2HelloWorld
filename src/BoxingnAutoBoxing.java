public class BoxingnAutoBoxing {
    public static void main(String[] args) {
        int i=10; //Premitive data type variable

        Integer a2=new Integer(i); //Used in wrapper class //Boxing

        Integer a1=20;// same wrapped in Integer wrapper class.

        System.out.println(a1+""+a2);


        Integer integer=new Integer(10);

        int i1=integer;//Unboxing
        //Integer integer=new Integer(10);

        System.out.println(i1);
    }
}
