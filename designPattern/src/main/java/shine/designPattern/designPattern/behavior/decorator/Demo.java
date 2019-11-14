package shine.designPattern.designPattern.behavior.decorator;

import java.util.function.Supplier;

/**
 * @author Shine!!!
 * 
 *         Here New behavior can be added into object at run time.
 * 
 *         Any candidate can be normal, good and best. All flavour can be added
 *         at runtime
 *
 */
public class Demo {

	public static void main(String[] args) {

		CandidateonBoard candidate = new NormalCandidate();

		System.out.println(candidate.provideKit());
		System.out
				.println("Joining Bonus is : " + candidate.joininggBonus(100));

		candidate = new GoodCandidate(candidate);

		System.out.println(candidate.provideKit());
		System.out
				.println("Joining Bonus is : " + candidate.joininggBonus(100));

		candidate = new BestCandidate(candidate);

		System.out.println(candidate.provideKit());
		System.out
				.println("Joining Bonus is : " + candidate.joininggBonus(100));

		// Another way

		System.out.println("****************************");

		CandidateonBoard candidate1 = new BestCandidate((new GoodCandidate(
				new NormalCandidate())));
		System.out.println(candidate1.provideKit());
		System.out.println("Joining Bonus is : "
				+ candidate1.joininggBonus(1000));

	}

}
