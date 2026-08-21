/*Problem Statement – Vohra went to a movie with his friends in a Wave theatre and during  break time he bought pizzas, puffs and cool drinks. Consider   the following prices : 

Rs.100/pizza
Rs.20/puffs
Rs.10/cooldrink
Generate a bill for What Vohra has bought.

Sample Input 1:

Enter the no of pizzas bought:10
Enter the no of puffs bought:12
Enter the no of cool drinks bought:5
Sample Output 1:

Bill Details

No of pizzas:10
No of puffs:12
No of cooldrinks:5
Total price=1290
ENJOY THE SHOW!!! */import java.util.*;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pizza = sc.nextInt();
        int puffs = sc.nextInt();
        int cooldrinks = sc.nextInt();

        int pizzaPrice = 100;
        int puffsPrice = 20;
        int cooldrinksPrice = 10;

        int totalPizza = pizza * pizzaPrice;
        int totalPuffs = puffs * puffsPrice;
        int totalCooldrinks = cooldrinks * cooldrinksPrice;

        System.out.println("No of pizzas:" + pizza);
        System.out.println("No of puffs:" + puffs);
        System.out.println("No of cooldrinks:" + cooldrinks);
        System.out.println("Total price=" + (totalPizza + totalPuffs + totalCooldrinks));
        System.out.println("ENJOY THE SHOW!!!");
    }
}
