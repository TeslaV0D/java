public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] strings = new String[3];
        strings[0] = "Hallo";
        strings[1] = "Wie gehts";
        strings[2] = "Ciao";
        System.out.println(strings[0] + " " + strings[1] + " " + strings[2]);

        for(int i = 0; i<strings.length; i++){
            System.out.println(strings[i]);
        }

        for(String string:strings){
            System.out.println(string);
        }

        int[] numbers1 = {1,2,3};
        int sum = 0;
        for(int x:numbers1){
            sum = sum+x;
            System.out.println(sum);
        }

        int value = 0;
        String s;
    }
}
