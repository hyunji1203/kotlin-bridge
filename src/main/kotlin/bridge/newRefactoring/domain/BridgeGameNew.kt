package bridge.newRefactoring.domain

class BridgeGameNew {
    fun move(userBridge : MutableList<String>, bridge : List<String>) : MutableList<String> {
        var bridgeMatch = mutableListOf<String>()
        for (i in 0 until userBridge.size){
            if (userBridge == bridge) bridgeMatch.add("O")
            if (userBridge != bridge) bridgeMatch.add("X")
        }
        return bridgeMatch
    }

    fun retry() {}
}