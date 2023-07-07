package minesweeper.ui

object InputView {
    fun getHeight(): Int {
        println("높이를 입력하세요.")
        return readln().toInt()
    }

    fun getWidth(): Int {
        println()
        println("너비를 입력하세요.")
        return readln().toInt()
    }

    fun getMinesNumber(): Int {
        println()
        println("지뢰는 몇 개인가요?")
        return readln().toInt()
    }
}
