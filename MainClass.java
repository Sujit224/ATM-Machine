import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        AtmOperations op = new AtmImplementation();
        int atmnumber = 12345;
        int atmPin = 123;
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your ATM Number:");
        int atmNumber = in.nextInt();

        System.out.println("Enter your Pin");
        int Pin = in.nextInt();

        if(atmnumber==atmNumber && atmPin==Pin){
            System.out.println("Welcome to ATM machine");
            while(true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n 3.Deposit Amount\n4.View Ministatement\n5.Exit");
                System.out.println("Enter your choice");
                int Ch = in.nextInt();
                if(Ch==1){
                    op.viewBalance();
                }
                else if(Ch==2){
                    System.out.println("Enter amount to be withDrawn");
                    double withdrawAmount = in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }

                else if(Ch ==3){
                    System.out.println("Enter amount to be Deposited: ");
                    double depositAmount = in.nextDouble();
                    op.depositAmount(depositAmount);
                }

                else if(Ch ==4){

                }

                else if(Ch==5){
                    System.out.println("Collect your ATM card");
                    System.out.println("Thank You for Choosing ATM machine");
                    System.exit(0);
                }

                else{
                   System.out.println("Please enter Correct Choice");
                }
            }
        }
        else{
            System.out.println("Please enter the Correct Pin");
            System.exit(0);
        }
    }
}
