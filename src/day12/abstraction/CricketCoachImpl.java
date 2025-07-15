package day12.abstraction;

public class CricketCoachImpl implements CricketCoach{

	@Override
	public void workoutPlan() {
		System.out.println("I am cricket coach and I will prepare your workout plan");
	}

	@Override
	public void dietPlan() {
		// TODO Auto-generated method stub
		System.out.println("I am cricket coach and I will prepare your diet plan");
		
	}

	@Override
	public void scoreRuns() {
		System.out.println("Coach is teaching how to score runs");
	}

}
