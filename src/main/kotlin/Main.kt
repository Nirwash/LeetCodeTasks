

fun main(args: Array<String>) {
    val nums = intArrayOf(2, 4, 1)
    val target = 6
    val answer = mutableListOf<Int>()
    var rest = target
    for (item in nums) {
        if (item <= rest) {
            rest -= item
            if (rest == 0) continue
            val index = nums.indexOf(item)
            answer.add(index)
        }
    }
    val intArray = answer.toIntArray()

}
