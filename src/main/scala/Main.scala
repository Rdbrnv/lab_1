import scala.util.Random

object SumOfPairs extends App {

  def generateRandomList(size: Int): List[Int] = {
    List.fill(size)(Random.nextInt(100)) // Генерация списка случайных чисел до 100
  }

  def sumOfPairs(list: List[Int], target: Int): Int = {
    val distinctPairs = for {
      i <- list
      j <- list if i < j && (i + j) < target
    } yield i + j

    distinctPairs.sum
  }

  val randomListSize = 10
  val randomList = generateRandomList(randomListSize)
  val targetValue = 25

  println(s"Сгенерированный список чисел: $randomList")
  println(s"Заданное значение: $targetValue")
  println(s"Сумма всех пар неодинаковых чисел меньше $targetValue: ${sumOfPairs(randomList, targetValue)}")
}
