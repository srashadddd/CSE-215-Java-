import java.text.DecimalFormat;
import java.util.Scanner;

class Footballer {
    private String name;
    private String team;
    private String position;
    private int matches;
    private int goals;
    private int assists;

    // Default constructor
    public Footballer() {
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for team
    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }

    // Getter and Setter for position
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    // Methods to increase stats
    public void increaseMatches() {
        matches++;
    }
    public void increaseGoals(int g) {
        goals += g;
    }
    public void increaseAssists(int a) {
        assists += a;
    }

    // Compare method
    public void compare(Footballer other) {
        if (this.goals > other.goals && this.assists > other.assists) {
            System.out.println(this.name + " has more goals and assists than " + other.name);
        } else if (this.goals > other.goals && this.assists <= other.assists) {
            System.out.println(this.name + " has more goals but fewer or equal assists than " + other.name);
        } else if (this.assists > other.assists && this.goals <= other.goals) {
            System.out.println(this.name + " has more assists but fewer or equal goals than " + other.name);
        } else {
            System.out.println(this.name + " has fewer goals and assists than " + other.name);
        }
    }

    // Homework methods with DecimalFormat rounding
    public int getMatches() {
        return matches;
    }

    public double getAvgGoals() {
        if (matches == 0) return 0;
        return round((double) goals / matches);
    }

    public double getAvgAssists() {
        if (matches == 0) return 0;
        return round((double) assists / matches);
    }

    public double getAvgContributions() {
        if (matches == 0) return 0;
        return round((double) (goals + assists) / matches);
    }

    public double getGoalsAssistRatio() {
        if (assists == 0) return goals; 
        return round((double) goals / assists);
    }

    // Helper method for rounding
    private double round(double value) {
        DecimalFormat df = new DecimalFormat("0.00");
        String roundedValue = df.format(value);
        return Double.parseDouble(roundedValue);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //(Mbappé vs Haaland with given stats)
        Footballer mbappe = new Footballer();
        mbappe.setName("Kylian Mbappe");
        mbappe.setTeam("PSG");
        mbappe.setPosition("Left-Winger");

        Footballer haaland = new Footballer();
        haaland.setName("Erling Haaland");
        haaland.setTeam("Manchester City");
        haaland.setPosition("Center-Forward");

        // Match 1
        mbappe.increaseMatches();
        mbappe.increaseGoals(2);
        mbappe.increaseAssists(0);

        haaland.increaseMatches();
        haaland.increaseGoals(2);
        haaland.increaseAssists(1);

        // Match 2
        mbappe.increaseMatches();
        mbappe.increaseGoals(3);
        mbappe.increaseAssists(0);

        haaland.increaseMatches();
        haaland.increaseGoals(2);
        haaland.increaseAssists(1);

        // Match 3
        mbappe.increaseMatches();
        mbappe.increaseGoals(2);
        mbappe.increaseAssists(2);

        haaland.increaseMatches();
        haaland.increaseGoals(2);
        haaland.increaseAssists(2);

        // Compare results
        mbappe.compare(haaland);
        haaland.compare(mbappe);

       // Homework - (Array of 15 players with user input)
        Footballer[] players = new Footballer[15];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Footballer();
            sc.nextLine(); // clear leftover newline before string input

            System.out.println("Enter name for Player " + (i + 1) + ":");
            players[i].setName(sc.nextLine());

            System.out.println("Enter team for Player " + (i + 1) + ":");
            players[i].setTeam(sc.nextLine());

            System.out.println("Enter position for Player " + (i + 1) + ":");
            players[i].setPosition(sc.nextLine());

            for (int j = 1; j <= 10; j++) {   // 10 matches per player
                System.out.println("Enter goals and assists for Player " + (i + 1) + " in Match " + j + ":");
                int g = sc.nextInt();
                int a = sc.nextInt();
                players[i].increaseMatches();
                players[i].increaseGoals(g);
                players[i].increaseAssists(a);
            }
        }

        // Printing the new player stats
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("\nPlayer\tTotal Matches\tGoals/Match\tAssists/Match\tContributions/Match\tGoals/Assist Ratio");
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i].getName() + "\t" +
                players[i].getMatches() + "\t\t" +
                df.format(players[i].getAvgGoals()) + "\t\t" +
                df.format(players[i].getAvgAssists()) + "\t\t" +
                df.format(players[i].getAvgContributions()) + "\t\t\t" +
                df.format(players[i].getGoalsAssistRatio()));
        }

        sc.close();
    }
}