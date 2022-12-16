package bridge.newRefactoring.domain

import bridge.BridgeRandomNumberGenerator
import bridge.newRefactoring.UI.OutputV
import bridge.newRefactoring.UI4.InputV

class GameControllerNew {
    var gameTimes = 1
    var userBridge = mutableListOf<String>()

    fun gameStart(){
        var bridge = GameControllerNew().bridgeCreate()

        while (bridge != userBridge){
            userBridge = userMove()
            var bridgeMatch = BridgeGameNew().move(userBridge, bridge)

            OutputV().printMap(bridgeMatch, userBridge)

            //최종 결과 출력
            if (bridge == userBridge) gameResult(bridgeMatch, "성공")

            if (bridgeMatch.contains("X")){
                var command = InputV().readGameCommand()
                if (command == "R"){
                    bridgeMatch.clear()
                    userBridge = BridgeGameNew().retry(userBridge)
                    gameTimes++
                }
                if (command == "Q") {
                    gameResult(bridgeMatch, "실패")
                    break
                }
            }
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

    fun failSituation(bridgeMatch: MutableList<String>,): MutableList<String>{
        var command = InputV().readGameCommand()
        if (command == "R"){
            bridgeMatch.clear()
            BridgeGameNew().retry(userBridge)
            gameTimes++
        }
        if (command == "Q") gameResult(bridgeMatch, "실패")
        return bridgeMatch
    }

    fun gameResult(bridgeMatch: MutableList<String>, success: String){
        OutputV().printResult(bridgeMatch, userBridge)
        OutputV().gameSuccess(success)
        OutputV().gameTimes(gameTimes)
    }
}