import javax.swing.JOptionPane;    

class productDetails{
    private String prodName;
    private double prodPrice;
    
    public String getProdName()
    {
        return prodName;
    }
    
    public double getProdPrice()
    {
        return prodPrice;
    }
    
    public void setProdName(String name)
    {
        prodName = name;
    }
    
    public void setProdPrice(double price)
    {
        prodPrice = price;
    }
    
    public void display()
    {
        JOptionPane.showMessageDialog(null, "Product name: " + prodName + "\n" + "Product price: " + prodPrice, "Product", 
                                           JOptionPane.INFORMATION_MESSAGE);
    }
}

public class Product{
    public static void main(String[] args) 
    {
    productDetails p = new productDetails();
        
    String nameInput = JOptionPane.showInputDialog(null, "Enter product name: ");
    
    String priceInput = JOptionPane.showInputDialog(null, "Enter product name: ");
    int price = Integer.parseInt(priceInput);
    
    p.setProdName(nameInput);
    p.setProdPrice(price);
    
    p.display();
    
    }
    
}