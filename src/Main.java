public class Main {
    public static void main(String[] args) {
        String canWeGoForWalk = canWeGoForWalk(8, 18 );
        System.out.println(canWeGoForWalk);
        String canWeGoForWalk1 = canWeGoForWalk(24, 37);
        System.out.println(canWeGoForWalk1);
        String canWeGoForWalk2 = canWeGoForWalk(50, 17);
        System.out.println(canWeGoForWalk2);
        String canWeGoForWalk3 = canWeGoForWalk(38, 28);
        System.out.println(canWeGoForWalk3);
        String canWeGoForWalk4 = canWeGoForWalk(3, -18);
        System.out.println(canWeGoForWalk4);
        String canWeGoForWalk5 = canWeGoForWalk(generateRandomAge(), 30);
        System.out.println(canWeGoForWalk5);
    }

    public static String canWeGoForWalk(int age , int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return  ("Можно идти гулять");
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return  ("Можно идти гулять");
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return ("Можно идти гулять");
        } else {
            return ("Оставайтесь дома");
        }
    }

    public static int generateRandomAge(){
        int a = (int) ( Math.random() * 50 );
        System.out.println("Возраст человека: " + a);
        return a;
    }

}