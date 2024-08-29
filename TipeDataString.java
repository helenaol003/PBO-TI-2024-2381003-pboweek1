public class TipeDataString {
    public static void main(String[] args) {
        //Perbedaan primitif dan non primitif

        String firstName = "Helena";
        String middleName = "Onezia";
        String lastName = "Lewi";

        //Concat
        //String fullName =firstName + " " + lastName;
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);
    }
}
