package bridge

import bridge.newRefactoring.UI.OutputV
import bridge.newRefactoring.UI4.InputV
import bridge.newRefactoring.domain.BridgeGameNew
import bridge.newRefactoring.domain.BridgeMakerNew
import bridge.newRefactoring.domain.GameControllerNew

fun main() {
    GameControllerNew().gameStart()
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
