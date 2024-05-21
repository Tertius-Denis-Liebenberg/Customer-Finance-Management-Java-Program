package com.mycompany.jd521.sa;
import javax.swing.JOptionPane;

// Super class
class Customer{
    public String Customer_Name;
    public String Contact_Number;
    public double Product_Price;
    public int Months;
    public double Monthly_Repayment;
    
    // Declares variables
    Customer(String Name, String Number, double Price, int Months){
        this.Customer_Name = Name;
        this.Contact_Number = Number;
        this.Product_Price = Price;
        this.Months = Months;
        this.Monthly_Repayment = this.calculate_repayment();
    }
    
    /* getter and setter methods for each set variable */
    
    public String getName(){
        return Customer_Name;
    }
    
    public void setName(String Name){
        this.Customer_Name = Name;
    }
    
    public String getNumber(){
        return Contact_Number;
    }
    
    public void setNumber(String Number){
        this.Contact_Number = Number;
    }
    
    public double getPrice(){
        return Product_Price;
    }
    
    public void setPrice(double Price){
        this.Product_Price = Price;
    }
    
    public int getMonths(){
        return Months;
    }
    
    public void setMonths(int Months){
        this.Months = Months;
    }
    
    // Calculator method
    public double calculate_repayment(){
        return Product_Price / Months;
    }
}

// Subclass
class Finance_Period extends Customer{
    public Finance_Period(String Name, String Number, double Price, int Months) {
        super(Name, Number, Price, Months);
    }
    
    // Overides super method
    @Override
    public double calculate_repayment(){
        double repayment = Product_Price / Months;
        
        // If repayment period is greater than 3 months, customer will pay 25% intrest
        if(Months > 3 && Months <= 12){
            return repayment + (repayment * 0.25) ;
        }
        return repayment;
    }
}

// Logic class
class Customer_Finance{
    public static void mainLogic(){
        // Asks for user inputs
        String Name = JOptionPane.showInputDialog("Please enter the customer name");
        String Number = JOptionPane.showInputDialog("Please enter the customer contact number");
        
        // Exeption handling
        try{
            // Verifies contact number
            if(Number.length() != 10){
                throw new InterruptedException();
            }
            
            double Price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the product"));
            int Months = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of repayment months"));
            
            // period may not be greater than 12 months
            if (Months <= 0 || Months > 12){
                throw new InterruptedException();
            }
            
            // Creates an object
            Finance_Period obj = new Finance_Period(Name, Number, Price, Months);
            
            // Displays desired info
            JOptionPane.showMessageDialog(null, 
                    "Customer Name: " + obj.getName() +
                    "\nCustomer Contact: " + obj.getNumber() +
                    "\nProduct Amount: R" + String.format("%,.2f", obj.getPrice()) + 
                    "\nRepayment Months: " + obj.getMonths() + 
                    "\nMonthly Repayment: R" + String.format("%,.2f", obj.calculate_repayment()) + 
                    "\nTotal Due: R" + String.format("%,.2f", obj.calculate_repayment() * obj.getMonths())
            );
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "An error has occureds");
            mainLogic();
        }
    }
}

// Main class
public class JD521_SA_Question2 {
    public static void main(String[] args){
        Customer_Finance obj = new Customer_Finance();
        obj.mainLogic();
    }
}