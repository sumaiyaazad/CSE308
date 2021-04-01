import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class DecoratorPatternCustomer {
    private static int  choice;
    public static void main(String args[]) throws NumberFormatException, IOException    {
        do{
            System.out.print("========= Pizza Menu ============ \n");
            System.out.print("            1. Beef Pizza with French Fry  \n");
            System.out.print("            2. Veggi Pizza with Onion Rings  \n");
            System.out.print("            3. Veggi Pizza with French Fry and Coke \n");
            System.out.print("            4. Veggi Pizza with Onion Rings and Coffee \n");
            System.out.print("            5. Beef Pizza \n");
            System.out.print("            6. Exit                        \n");
            System.out.print("Enter your choice: ");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:{
                    NormalPackageBeef menu1=new NormalPackageBeef(new BeefPizza());
                    System.out.println(menu1.preparePizza());
                    System.out.println( menu1.pizzaPrice());
                }
                break;

                case 2:{
                    NormalPackageVeggi menu2=new NormalPackageVeggi(new VeggiPizza());
                    System.out.println(menu2.preparePizza());
                    System.out.println( menu2.pizzaPrice());
                }
                break;

                case 3:{
                    ComboPackageVeggi1 menu3=new ComboPackageVeggi1(new VeggiPizza());
                    System.out.println(menu3.preparePizza());
                    System.out.println( menu3.pizzaPrice());
                }
                break;

                case 4:{
                    ComboPackageVeggi2 menu4=new ComboPackageVeggi2(new VeggiPizza());
                    System.out.println(menu4.preparePizza());
                    System.out.println( menu4.pizzaPrice());
                }
                break;

                case 5:{
                    BeefPizza menu5=new BeefPizza();
                    System.out.println(menu5.preparePizza());
                    System.out.println( menu5.pizzaPrice());
                }
                break;

                default:{
                    System.out.println("Other than these no pizza available");
                }
                return;
            }

        }while(choice!=6);
    }
}
