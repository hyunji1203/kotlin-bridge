package bridge.newRefactoring.UI4

import camp.nextstep.edu.missionutils.Console

class InputV {
    fun readBridgeSize(): Int {
        println("다리의 길이를 입력해주세요.")
        var size = Console.readLine().toInt()
        return size
    }

    fun readMoving(): String {
        println("이동할 칸을 선택해주세요. (위: U, 아래: D)")
        var moving = Console.readLine()
        return moving
    }

    fun readGameCommand(): String {
        return ""
    }
}