import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	
	private GradeBook gradeTest_1;
	private GradeBook gradeTest_2;

	@BeforeEach
	void setUp() throws Exception {
		gradeTest_1 = new GradeBook(5);
		gradeTest_2 = new GradeBook(5);

		gradeTest_1.addScore(23);
		gradeTest_1.addScore(40);
		gradeTest_1.addScore(56);

		gradeTest_2.addScore(30);
		gradeTest_2.addScore(93);
		gradeTest_2.addScore(97);
	}

	@AfterEach
	void tearDown() throws Exception {
		gradeTest_1 = null;
		gradeTest_2 = null;
	}

	@Test
	void testAddScore() {

		// grade 1
		String gradeActualOutput1 = gradeTest_1.toString();

		// grade 2
		String gradeActualOutput2 = gradeTest_2.toString();

		assertTrue(gradeActualOutput1.equals("23.0 40.0 56.0 0.0 0.0 "));
		
		assertTrue(gradeActualOutput2.equals("30.0 93.0 97.0 0.0 0.0 "));
		
		

		// Score sizes
		int scoreSize1 = gradeTest_1.getScoreSize();
		assertEquals(3, scoreSize1);

		int scoreSize2 = gradeTest_2.getScoreSize();
		assertEquals(3, scoreSize2);

	}
	@Test
	void testSum() {

		double sum1 = gradeTest_1.sum();
		double sum2 = gradeTest_2.sum();

		assertEquals(119.0, sum1, 0.0001);
		assertEquals(220.0, sum2, 0.0001);

	}


	@Test
	void testMinimum() {

		double minimumGrade1 = gradeTest_1.minimum();
		double minimumGrade2 = gradeTest_2.minimum();

		assertEquals(23.0, minimumGrade1, 0.001);
		assertEquals(30.0, minimumGrade2, 0.001);
	}


	@Test
	void testFinalScore() {

		double finalScore1 = gradeTest_1.finalScore();
		double finalScore2 = gradeTest_2.finalScore();

		assertEquals(96.0, finalScore1, 0.001);
		assertEquals(190.0, finalScore2, 0.0001);
	}

}
