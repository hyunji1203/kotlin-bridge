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

    //다리 이동
    while (bridge != userBridge){
        var moving = InputV().readMoving()
        userBridge.add(moving)
        var bridgeMatch = BridgeGameNew().move(userBridge, bridge)


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
