package bridge.newRefactoring.domain

import bridge.BridgeRandomNumberGenerator
import bridge.newRefactoring.UI.OutputV
import bridge.newRefactoring.UI4.InputV

class GameControllerNew {
    var gameTimes = 1
    var userBridge = mutableListOf<String>()
    var control = 0

    fun gameStart(){
        var bridge = GameControllerNew().bridgeCreate()
        while (control != 1){
            userBridge = userMove()
            var bridgeMatch = BridgeGameNew().move(userBridge, bridge)
            OutputV().printMap(bridgeMatch, userBridge)

            if (bridge == userBridge) successSituation(bridgeMatch)
            if (bridgeMatch.contains("X")) failSituation(bridgeMatch)
        }
    }

    fun bridgeCreate() : List<String>{
        OutputV().gameStart()
        var bridgeNumberGenerator = BridgeRandomNumberGenerator()
        var bridge = BridgeMakerNew(bridgeNumberGenerator).makeBridge(InputV().readBridgeSize())
        return bridge
    }

    fun userMove(): MutableList<String>{
        var moving = InputV().readMoving()
        userBridge.add(moving)
        return userBridge
    }

    fun successSituation(bridgeMatch: MutableList<String>){
        gameResult(bridgeMatch, "성공")
        control = 1
    }

    fun failSituation(bridgeMatch: MutableList<String>,): MutableList<String>{
        var command = InputV().readGameCommand()
        if (command == "R"){
            bridgeMatch.clear()
            BridgeGameNew().retry(userBridge)
            gameTimes++
        }
        if (command == "Q") {
            gameResult(bridgeMatch, "실패")
            control = 1
        }
        return bridgeMatch
    }

    fun gameResult(bridgeMatch: MutableList<String>, success: String){
        OutputV().printResult(bridgeMatch, userBridge)
        OutputV().gameSuccess(success)
        OutputV().gameTimes(gameTimes)
    }
}