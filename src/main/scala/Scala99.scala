import scala.annotation.tailrec

object Scala99 {

	def last(in: List[Int]): Option[Int] = {

		@tailrec
		def _last(in: List[Int]): Option[Int] = in match {
			case Nil => None
			case head :: Nil => Some(head)
			case head :: tail => _last(tail)
		}

		_last(in)
	}

	def penultimate(in: List[Int]): Option[Int] = {

		@tailrec
		def _penultimate(in: List[Int]): Option[Int] = in match {
			case Nil => None
			case head :: Nil => None
			case first :: second :: Nil => Some(first)
			case head :: tail => _penultimate(tail)
		}

		_penultimate(in)
	}

	def kth(k: Int, in: List[Int]): Option[Int] = {

		@tailrec
		def _kth(n: Int, in: List[Int]): Option[Int] = in match {
			case Nil => None
			case head :: tail if k == n => Some(head)
			case head :: tail => _kth(n + 1, tail)
		}

		_kth(0, in)
	}

	def length(in: List[Int]): Int = {

		@tailrec
		def _length(l: Int, in: List[Int]): Int = in match {
			case Nil => l
			case head :: tail => _length(1 + l, tail)
		}

		_length(0, in)
	}

	def reverse(in: List[Int]): List[Int] = {

		@tailrec
		def _reverse(out: List[Int], in: List[Int]): List[Int] = in match {
			case Nil => out
			case head :: tail => _reverse(head +: out, tail)
		}

		_reverse(Nil, in)
	}

	def isPalindrome(in: List[Int]): Boolean = false

	def flatten(in: List[Any]): List[Int] = Nil

	def compress(in: List[Symbol]): List[Symbol] = Nil

	def pack(in: List[Symbol]): List[Symbol] = Nil

	def encode(in: List[Symbol]): List[Symbol] = Nil

}