import java.util.Scanner;

class Agent {
    String name;
    double[] sales;

    Agent(String name, double[] sales) {
        this.name = name;
        this.sales = sales;
    }

    double getAverageSale() {
        double sum = 0;
        for (double sale : sales) {
            sum += sale;
        }
        return sum / sales.length;
    }

    double getHighestSale() {
        double max = sales[0];
        for (double sale : sales) {
            if (sale > max) max = sale;
        }
        return max;
    }
}

public class SalesAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of agents: ");
        int numAgents = scanner.nextInt();
        Agent[] agents = new Agent[numAgents];

        for (int i = 0; i < numAgents; i++) {
            System.out.print("\nEnter agent name: ");
            String name = scanner.next();
            System.out.print("Enter number of sales: ");
            int numSales = scanner.nextInt();
            double[] sales = new double[numSales];
            for (int j = 0; j < numSales; j++) {
                System.out.print("Enter sale " + (j + 1) + ": ");
                sales[j] = scanner.nextDouble();
            }
            agents[i] = new Agent(name, sales);
        }

        double totalAverage = 0;
        Agent topAgent = agents[0];
        double maxSale = topAgent.getHighestSale();

        for (Agent agent : agents) {
            totalAverage += agent.getAverageSale();
            if (agent.getHighestSale() > maxSale) {
                maxSale = agent.getHighestSale();
                topAgent = agent;
            }
        }
        totalAverage /= numAgents;

        System.out.printf("\nAverage sales: %.2f%n", totalAverage);
        System.out.println("Top agent: " + topAgent.name);
        System.out.printf("Highest sale: %.2f%n", topAgent.getHighestSale());

        scanner.close();
    }
}