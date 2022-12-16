package bridge.newRefactoring.domain

class Exception {
    fun sizeException(size: String){
        bridgeTypeException(size)
        bridgeSizeException(size)
    }

    fun bridgeTypeException(size : String){
        if (size.toIntOrNull() == null){
            throw IllegalArgumentException("[ERROR] 다리 길이는 3부터 20 사이의 숫자여야 합니다.")
        }
    }

    fun bridgeSizeException(size: String){
        if (size.toInt() in 21..2){
            throw IllegalArgumentException("[ERROR] 다리 길이는 3부터 20 사이의 숫자여야 합니다.")
        }
    }

    fun movingException(moving : String){
        if (moving != "U" && moving != "D"){
            throw IllegalArgumentException("[ERROR] U 또는 D를 입력하여야 합니다.")
        }
    }

    fun commandException(command : String){
        if (command != "R" && command != "Q"){
            throw IllegalArgumentException("[ERROR] R 또는 Q를 입력하여야합니다.")
        }
    }
}