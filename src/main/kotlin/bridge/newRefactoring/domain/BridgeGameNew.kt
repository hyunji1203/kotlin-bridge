package bridge.newRefactoring.domain

class BridgeGameNew {
    fun move(userBridge : MutableList<String>, bridge : List<String>) : MutableList<String> {
        var bridgeMatch = mutableListOf<String>()
        for (i in 0 until userBridge.size){
            if (userBridge[i] == bridge[i]) bridgeMatch.add("O")
            if (userBridge[i] != bridge[i]) bridgeMatch.add("X")
        }
        println(bridgeMatch)
        return bridgeMatch
    }

    fun retry() {

    }
}