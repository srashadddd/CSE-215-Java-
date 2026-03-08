class Footballer {
    private String name, team, position;
    private int matches, goals, assists;

    // Default constructor (no parameters allowed)
    Footballer() {
        name = "Unknown";
        team = "Unknown";
        position = "Unknown";
        matches = goals = assists = 0;
    }

    // Getters and setters
    public void setName(String n) { name = n; }
    public void setTeam(String t) { team = t; }
    public void setPosition(String p) { position = p; }

    // Methods to increase stats
    public void increaseMatches() { matches++; }
    public void increaseGoals(int g) { goals += g; }
    public void increaseAssists(int a) { assists += a; }

    // Comparison method
    public void compare(Footballer other) {
        if (goals > other.goals && assists > other.assists)
            System.out.println(name + " has more goals and assists than " + other.name);
        else if (goals > other.goals && assists <= other.assists)
            System.out.println(name + " has more goals but fewer/equal assists than " + other.name);
        else if (assists > other.assists && goals <= other.goals)
            System.out.println(name + " has more assists but fewer/equal goals than " + other.name);
        else
            System.out.println(name + " has fewer goals and assists than " + other.name);
    }
}

public class Lab8Classwork {
    public static void main(String[] args) {
        Footballer mbappe = new Footballer();
        mbappe.setName("Kylian Mbappe");
        mbappe.setTeam("PSG");
        mbappe.setPosition("Left-Winger");

        Footballer haaland = new Footballer();
        haaland.setName("Erling Haaland");
        haaland.setTeam("Manchester City");
        haaland.setPosition("Center-Forward");

        // Simulate matches
        mbappe.increaseMatches(); mbappe.increaseGoals(2); mbappe.increaseAssists(0);
        haaland.increaseMatches(); haaland.increaseGoals(2); haaland.increaseAssists(1);

        mbappe.increaseMatches(); mbappe.increaseGoals(3);
        haaland.increaseMatches(); haaland.increaseGoals(2); haaland.increaseAssists(1);

        mbappe.increaseMatches(); mbappe.increaseGoals(2); mbappe.increaseAssists(2);
        haaland.increaseMatches(); haaland.increaseGoals(2); haaland.increaseAssists(2);

        // Compare stats
        mbappe.compare(haaland);
        haaland.compare(mbappe);
    }
}
