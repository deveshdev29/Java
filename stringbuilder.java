public class stringbuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony Stark");
        System.out.println(sb);

        // char at index 0 
        System.out.println(sb.charAt(0));

        // replace char at index 
        sb.setCharAt(0,'S');
        System.out.println(sb);

        // inserting char at index 
        sb.insert(0, 'B');
        System.out.println(sb);

        // delete char at index 
        sb.delete(0, 1);
        System.out.println(sb);

        // append in  StringBuilder
        sb.append("pizza");
        System.out.println(sb);
    } 
}
