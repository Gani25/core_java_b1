package day12.abstraction;

public class MainClass {

	public static void main(String[] args) {
		// Cricket Coach
//		FootballCoach footballCoach= new FootballCoach();
//		footballCoach.dietPlan();
//		footballCoach.workoutPlan();
		
		Coach coach = new FootballCoachImpl();
		coach.dietPlan();
		coach.workoutPlan();
		
		FootBallCoach footBallCoach = new FootballCoachImpl();
		footBallCoach.dietPlan();
		footBallCoach.scoreGoal();
		footBallCoach.workoutPlan();
		
		CricketCoach cricketCoach =  new CricketCoachImpl();
		cricketCoach.dietPlan();
		cricketCoach.scoreRuns();
		cricketCoach.workoutPlan();
	}
}

