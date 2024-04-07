import java.util.*;
public class pc_3_q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of a Pencil =>");
        float pencil= sc.nextFloat();
        System.out.print("Enter the price of a Pen =>");
        float pen= sc.nextFloat();
        System.out.print("Enter the price of a Eraser =>");
        float eraser= sc.nextFloat();
        float total = pencil+pen+eraser;
        System.out.println("Total Price of items =>" +total);
        // Finding total bill with 18% GST

        float gst = (18f/100f) * total;
        System.out.println("GST => "+gst);

        float totalam = total + gst;
        System.out.println("Total Amount with G.S.T => "+totalam);
        sc.close();


    }
    
}
