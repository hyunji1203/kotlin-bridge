package bridge.newRefactoring.UI

class OutputV {
    fun printMap(bridgeMatch : MutableList<String>, userBridge : MutableList<String>) {
        printUpMap(bridgeMatch, userBridge)
        printDownMap(bridgeMatch, userBridge)
    }

    fun printResult() {}

    fun gameStart(){
        println("다리 건너기 게임을 시작합니다.")
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
}