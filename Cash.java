import javax.swing.*;

public class Cash extends Payment{
    private float cash ;
    private float diffrence;
    public Cash (float amount, float cash) {
        super (amount);
        this.cash = cash;
    }

    /** Deduct the due amount from the given cash
     * and calculate the change.
     * @return true if cash was enough to pay the due
     * and payment was successful
     */
    public boolean deductAmount() {
        diffrence = cash - getAmount();
        return (diffrence >=0);
    }

    /** Display a message saying if payment
     * was successful (cash larger than or equal due amount)
     * or not
     */
    public void displayMessage () {
        if (diffrence >=0)
            JOptionPane.showMessageDialog(null,
                    "You paid: " + cash + " and change: " + diffrence,
                    "Successful Cash Payment",
                    JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,
                    "You paid: " + cash + " but required amount is: " + getAmount(),
                    "Unsuccessful Cash Payment",
                    JOptionPane.ERROR_MESSAGE);
    }
}

