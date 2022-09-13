public class Pratiku1_Kadek {
    public static void main(String[] args) {
        String operator1 = args[0];
        String operator2 = args[4];
        String operator3 = args[8];
        int operan1 = Integer.parseInt(args[1]);
        int operan2 = Integer.parseInt(args[2]);
        int operan3 = Integer.parseInt(args[4]);
        int operan4 = Integer.parseInt(args[5]);
        int operan5 = Integer.parseInt(args[7]);
        int operan6 = Integer.parseInt(args[8]);

        System.out.print("Result :" + hasil(operan1, operan2, operator1) + "" + hasil(operan3, operan4, operator2) + "" + hasil(operan5, operan6, operator3));
    }
        static int hasil(int i,int j,String op) {
        switch (op) {
            case "1":
                return i+j;

            case "2":
                return i-j;

            case "3":
                return i*j;
            default:
                System.out.println("masukan operator yang benar");
                return 0;
        }



    }
}
