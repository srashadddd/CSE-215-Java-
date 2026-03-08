import java.text.DecimalFormat;
import java.util.Scanner;

class Footballers {
    private String name, team, position;
    private int matches;
    private int goals;
    private int assists;

    // Default constructor
    Footballers() {
        name = "Unknown";
        team = "Unknown";
        position = "Unknown";
        matches = goals = assists = 0;
    }

    // Setters
    public void setName(String n) { name = n; }
    public void setTeam(String t) { team = t; }
    public void setPosition(String p) { position = p; }

    // Increase stats
    public void increaseMatches() { matches++; }
    public void increaseGoals(int g) { goals += g; }
    public void increaseAssists(int a) { assists += a; }

    // Return stats
    public int getMatches() { return matches; }

    public double getAvgGoals() {
        return matches == 0 ? 0 : (double) goals / matches;
    }

    public double getAvgAssists() {
        return matches == 0 ? 0 : (double) assists / matches;
    }

    public double getGoalContributions() {
        return matches == 0 ? 0 : (double) (goals + assists) / matches;
    }

    public double getGoalsAssistRatio() {
        return assists == 0 ? goals : (double) goals / assists;
    }

    // Display stats in formatted manner
    public void displayStats(DecimalFormat df) {
        System.out.printf("%-15s %-10d %-12s %-12s %-20s %-15s\n",
                name,
                matches,
                df.format(getAvgGoals()),
                df.format(getAvgAssists()),
                df.format(getGoalContributions()),
                df.format(getGoalsAssistRatio()));
    }
}

public class Lab8Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // Create array of 15 footballers
        Footballers[] players = new Footballers[15];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Footballers();

            System.out.println("Enter details for Player " + (i + 1));
            System.out.print("Name: ");
            players[i].setName(sc.nextLine());
            System.out.print("Team: ");
            players[i].setTeam(sc.nextLine());
            System.out.print("Position: ");
            players[i].setPosition(sc.nextLine());

            // Each player plays 10 matches
            for (int match = 1; match <= 10; match++) {
                System.out.print("Goals in Match " + match + ": ");
                int g = sc.nextInt();
                System.out.print("Assists in Match " + match + ": ");
                int a = sc.nextInt();
                sc.nextLine(); // consume newline

                players[i].increaseMatches();
                players[i].increaseGoals(g);
                players[i].increaseAssists(a);
            }
        }

        // Print table header
        System.out.printf("%-15s %-10s %-12s %-12s %-20s %-15s\n",
                "Player", "Matches", "Goals/Match", "Assists/Match",
                "Goal Contributions/Match", "Goals/Assist Ratio");

        // Print stats for each player
        for (Footballers f : players) {
            f.displayStats(df);
        }
    }
}
