public class Main {

    public static void main(String[] args) {
        String message = "Hava güzel";
        String newMessage = message.substring(0,2);
        System.out.println(newMessage);
        int number = sum(5,7);
        System.out.println(number);
        int total = sum2(2,3,4);
        System.out.println(total);


    }
    public static void add(){
        System.out.println("Added");

    }
    public static void delete(){
        System.out.println("Deleted");

    }
    public static void update(){
        System.out.println("Updated");

    }

    public static int sum(int number1, int number2){
        return number1+number2;
    }

    public static int sum2(int... numbers){
        int total = 0;
        for (int number: numbers){
            total+= number;

        }
        return total;
    }

    public static String city(){
        return "Ankara";
    }
}
