package bridge.newRefactoring.UI4

import bridge.newRefactoring.domain.Exception
import camp.nextstep.edu.missionutils.Console

class InputV {
    fun readBridgeSize(): Int {
        var size = ""
        try {
            println("다리의 길이를 입력해주세요.")
            size = Console.readLine()
            Exception().sizeException(size)
        }catch (e : IllegalArgumentException){
            println(e.message)
            return readBridgeSize()
        }
        return size.toInt()
    }

    fun readMoving(): String {
        var moving = ""
        try {
            println("이동할 칸을 선택해주세요. (위: U, 아래: D)")
            moving = Console.readLine()
            Exception().movingException(moving)
        }catch (e : IllegalArgumentException){
            println(e.message)
            return readMoving()
        }
        return moving
    }

    fun readGameCommand(): String {
        var command = ""
        try {
            println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)")
            command = Console.readLine()
            Exception().commandException(command)
        }catch (e : IllegalArgumentException){
            println(e.message)
            return readGameCommand()
        }
        return command
    }
}