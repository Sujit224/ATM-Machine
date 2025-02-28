public class AtmImplementation implements AtmOperations{

    ATM atm = new ATM();
    public static void main(String[] args) {
        
    }
    @Override
    public void depositAmount(double depositAmount) {
        atm.setBalance(atm.getBalance()+depositAmount);
        System.out.println("Amount"+depositAmount+"succesfully deposited!!");
        System.out.println("The current balance is "+atm.getBalance());
    }

    @Override
    public void viewBalance() {
        System.out.println("Available Balance is: "+atm.getBalance());
       
    }

    @Override
    public void viewMiniStatement() {
        
        
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(atm.getBalance()<withdrawAmount){
            System.out.println("Your account has Insufficient Balance");
        }
        else{
            atm.setBalance(atm.getBalance()-withdrawAmount);
            System.out.println("The new Balance is "+atm.getBalance());
        }       
    }
    
}
