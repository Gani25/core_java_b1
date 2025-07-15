package day12.abstraction;

public class FootballCoachImpl implements FootBallCoach {

	@Override
	public void workoutPlan() {
		System.out.println("I am football coach and I will prepare your workout plan");
	}

	@Override
	public void dietPlan() {
		// TODO Auto-generated method stub
		System.out.println("I am football coach and I will prepare your diet plan");
	}
	
	@Override
	public void scoreGoal() {
		System.out.println("Coach is teaching how to goal");
	}

}
