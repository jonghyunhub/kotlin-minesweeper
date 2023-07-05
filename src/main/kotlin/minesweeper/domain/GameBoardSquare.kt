package minesweeper.domain

class GameBoardSquare(private var squareValueType: SquareValueType) {
    fun isMine(): Boolean {
        return squareValueType == SquareValueType.MINE
    }

    fun insertMine() {
        squareValueType = SquareValueType.MINE
    }

    fun printValue(): Char {
        return squareValueType.value
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GameBoardSquare

        return squareValueType == other.squareValueType
    }

    override fun hashCode(): Int {
        return squareValueType.hashCode()
    }
}