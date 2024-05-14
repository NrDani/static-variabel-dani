/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package static_variabel_dani;

/**
 *
 * @author nuran
 */

class Display{
    static String type = "Display";
    private String name;

    Display(String name){
        this.name = name;
    }
    
    void setType(String typeInput){
    Display.type = typeInput;
    }
    
    void show(){
    System.out.println("Display name = " + this.name);
    }
}
public class Static_variabel_dani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Display display1 = new Display("Monitor");
        display1.show();
        
        Display display2 = new Display("Smartphone");
        display2.show();
        
       System.out.println("==================================");
       
       
       
       display1.setType("Monitor");
       
       System.out.println("Menampilkan static variabel");
       System.out.println(display1.type);
       System.out.println(display2.type);
       System.out.println(Display.type);
       
    }
    
}
