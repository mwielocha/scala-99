import org.scalatest._

class Scala99Spec extends FlatSpec with Matchers {

	"Scala99" should "Find the last element of a list" in {

		Scala99.last(List(1, 1, 2, 3, 5, 8)) shouldBe Some(8)

	}

	it should "Find the last but one element of a list" in {

		Scala99.penultimate(List(1, 1, 2, 3, 5, 8)) shouldBe Some(5)	

	}

	it should "Find the Kth element of a list" in {

		Scala99.kth(2, List(1, 1, 2, 3, 5, 8)) shouldBe Some(2)	

	}

	it should "Find the number of elements of a list" in {

		Scala99.length(List(1, 1, 2, 3, 5, 8)) shouldBe 6

	}

	it should "Reverse a list" in {

		Scala99.reverse(List(1, 1, 2, 3, 5, 8)) shouldBe List(8, 5, 3, 2, 1, 1)

	}

	it should "Find out whether a list is a palindrome" in {

		Scala99.isPalindrome(List(1, 2, 3, 2, 1)) shouldBe true

	}

	it should "Flatten a nested list structure" in {

		Scala99.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) shouldBe List(1, 1, 2, 3, 5, 8)

	}

	it should "Eliminate consecutive duplicates of list elements" in {

		Scala99.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe List('a, 'b, 'c, 'a, 'd, 'e)

	}

	it should "Pack consecutive duplicates of list elements into sublists" in {

		Scala99.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))

	}

	it should "Run-length encoding of a list" in {

		Scala99.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
	}
}

