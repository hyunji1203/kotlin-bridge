package bridge.newRefactoring.domain

import bridge.BridgeNumberGenerator

class BridgeMakerNew(private val bridgeNumberGenerator: BridgeNumberGenerator) {
    fun makeBridge(size: Int): List<String> {
        val number = bridgeNumberGenerator.generate()
        return listOf()
    }
}