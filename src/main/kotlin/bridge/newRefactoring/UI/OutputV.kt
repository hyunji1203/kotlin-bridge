package bridge.newRefactoring.UI

class OutputV {
    fun gameStart(){
        println("다리 건너기 게임을 시작합니다.")
    }

    fun printMap(bridgeMatch : MutableList<String>, userBridge : MutableList<String>) {
        printUpMap(bridgeMatch, userBridge)
        printDownMap(bridgeMatch, userBridge)
    }

    fun printUpMap(bridgeMatch : MutableList<String>, userBridge : MutableList<String>) {
        for (i in 0 until userBridge.size){
            if (i == 0) print("[")
            if (userBridge[i] == "U") print(" ${bridgeMatch[i]} ")
            if (userBridge[i] != "U") print("   ")
            if (userBridge.size >= 2 && i == 0) print("|")
            if (i != 0 && i != userBridge.size-1) print("|")
            if (i == userBridge.size-1) println("]")
        }
    }
    fun printDownMap(bridgeMatch : MutableList<String>, userBridge : MutableList<String>) {
        for (i in 0 until userBridge.size){
            if (i == 0) print("[")
            if (userBridge[i] == "D") print(" ${bridgeMatch[i]} ")
            if (userBridge[i] != "D") print("   ")
            if (userBridge.size >= 2 && i == 0) print("|")
            if (i != 0 && i != userBridge.size-1) print("|")
            if (i == userBridge.size-1) println("]")
        }
    }

    fun printResult(bridgeMatch: MutableList<String>, userBridge: MutableList<String>) {
        println("최종 게임 결과")
        printMap(bridgeMatch, userBridge)
    }

    fun gameSuccess(success : String){
        if (success == "성공") println("게임 성공 여부: $success")
        if (success == "실패") println("게임 성공 여부: $success")
    }

    fun gameTimes(gameTimes : Int){
        println("총 시도한 횟수: $gameTimes")
    }
}