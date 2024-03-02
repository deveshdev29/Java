class new_string{
    public static void main(String[] arg){
        String string1 = "Hello";
        String string2 = "Hello";

        String string3 = new String("HelloWorld");
        String string4 = new String("HelloWorld");

        System.out.println(string1 == string2);
        System.out.println(string3 == string4);
    }
}