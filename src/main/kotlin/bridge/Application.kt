package bridge

import bridge.newRefactoring.UI.OutputV
import bridge.newRefactoring.UI4.InputV
import bridge.newRefactoring.domain.BridgeGameNew
import bridge.newRefactoring.domain.BridgeMakerNew

fun main() {
    OutputV().gameStart()

    //다리 생성
    var bridgeNumberGenerator = BridgeRandomNumberGenerator()
    var bridge = BridgeMakerNew(bridgeNumberGenerator).makeBridge(InputV().readBridgeSize())
    var userBridge = mutableListOf<String>()
    var gameTimes = 1
    println(bridge)

    //다리 이동
    while (bridge != userBridge){
        var moving = InputV().readMoving()
        println(moving)
        userBridge.add(moving)
        var bridgeMatch = BridgeGameNew().move(userBridge, bridge)

        //다리 출력
        OutputV().printMap(bridgeMatch, userBridge)

        //최종 결과 출력
        if (bridge == userBridge) {
            OutputV().printResult(bridgeMatch, userBridge)
            OutputV().gameSuccess("성공")
            OutputV().gameTimes(gameTimes)
        }

        if (bridgeMatch.contains("X")){
            var command = InputV().readGameCommand()
            bridgeMatch.clear()
            userBridge.clear()
        }
    }

}


//{
//    println("다리 건너기 게임을 시작합니다.")
//    var bridgeLength = InputView().readBridgeSize()
//    var bridgeMaker = BridgeMaker(BridgeRandomNumberGenerator())
//    var bridge = bridgeMaker.makeBridge(bridgeLength)
//
//    var bridgeGame = BridgeGame(mutableListOf(),1,0)
//    bridgeGame.move(bridge)
//}
