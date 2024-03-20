public class typecasting {
    public static void main(String[] args) {
        // the int is converted into the float as they are compatible
        // asking for smaller and getting bigger not posssible
        // asking for float from int is not possible
        // and if want to make possible do type casting
        // narrowing conversion

        /* typecasting */
        int num = (int) (67.78f);
        System.out.println(num); // o/p 67

        /* Automatic type promotion in expression */
        int a = 257;
        byte b = (byte) (a); // 256%256=1
        System.out.println(b); // o/p 1

        byte z = 4;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 56.7f;
        double d = 0.125;
        double result = (f + z) + (f / c) - (d * s);
        System.out.println(result); // complete result is converted into double

    }

}
