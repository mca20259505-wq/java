 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter principal amount :");
        double p = sc.nextDouble();

        System.out.println("enter rate");
        double rate = sc.nextDouble();

        System.out.println("Enter duration :");
        double duration = sc.nextDouble();

        double simple_interest = (p * rate * duration) / 100;

        System.out.println("simple interest :" + simple_interest);

        sc.close();
    }
}